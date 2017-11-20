var app = angular.module('myApp', ['ui.router']);

app.config(function($stateProvider,$urlRouterProvider,$locationProvider){
    $urlRouterProvider.otherwise('/welcome');
    $locationProvider.hashPrefix('');
    $stateProvider
        .state('welcome',{
            params:{"customerId":null},
            url:'/welcome',
            templateUrl: '../html/welcome.html'
        })
        .state('customer',{
            url:'/customer',
            templateUrl: '../html/customerInformation.html',
            controller:'customerController'
        })
        .state('packageInformation',{
            url:'/packageInformation',
            templateUrl:'../html/packageInformation.html',
            controller:'packageInformationController'
        })
});


app.controller("customerController", function ($scope, $http) {

    $scope.data = function(currentPage){
        $http.get("../customer/findAllCustomer.htm?currentPage="+currentPage)
            .then(function (response) {
                $scope.customerList = response.data.data;
                $scope.pageList = [];
                for (var i = 0; i < response.data.totalPage; i++) {
                    $scope.pageList.push(i + 1);
                }
                $scope.totalPage = response.data.totalPage;
            }
        )};
    $scope.selPage = 1;
    $scope.data($scope.selPage);

    $scope.selectPage = function (page) {
        if(page<1 || page >$scope.totalPage){
            return;
        }
        var currentPage = page;
        $http.get("../customer/findAllCustomer.htm?currentPage="+currentPage)
            .then(function (response){
                $scope.customerList = response.data.data;
                //最多显示分页数5
                if (page > 2) {
                    //因为只显示5个页数，大于2页开始分页转换
                    var newpageList = [];
                    for (var i = (page - 3); i < ((page + 2) > response.data.totalPage ? response.data.totalPage : (page + 2)); i++) {
                        newpageList.push(i + 1);
                    }
                    $scope.pageList = newpageList;
                }
        });
        $scope.selPage = page;
        //$scope.setData();
        $scope.isActivePage(page);
        console.log("选择的页：" + page);
    };
    $scope.isActivePage = function (page) {
        return $scope.selPage == page;
    };
//上一页
    $scope.Previous = function () {
        $scope.selectPage($scope.selPage - 1);
    };
//下一页
    $scope.Next = function () {
        $scope.selectPage($scope.selPage + 1);
    };
});

app.controller('packageInformationController',function($scope,$http){
    $http({
        method: 'post',
        url: '../action/package-information!findAllPackageInformation.do'
    }).then(function successCallBack(response){
        $scope.packageInformations = response.data;
    },function errorCallBack(response){
        alert("错误");
    })
});

