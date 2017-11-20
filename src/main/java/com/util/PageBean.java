package com.util;/********************************************************************
 /**
 * @Project: spring_web
 * @Package com.util
 * @author wangzhenxin
 * @date 2017-10-26 16:20
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import com.domain.Customer;

import java.util.List;

/**
 * @author wangzhenxin
 * @ClassName PageBean
 * @Description 类描述
 * @date 2017-10-26
 */
public class PageBean<T> {
    /**
     * 分页对象。用于封装当前页的分页相关的所有数据
     *
     * @author h
     */
    private List<T> data;//当前页的数据
    private Integer firstPage;//首页
    private Integer prePage;//上一页
    private Integer nextPage;//下一页
    private Integer totalPage;//末页、总页数
    private Integer currentPage;//当前页
    private Integer totalCount;//总记录数
    private Integer vernier;//当前标记位置
    private Integer pageSize;//每页显示的记录数

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public Integer getFirstPage() {
        return 1;
    }

    public void setFirstPage(Integer firstPage) {
        this.firstPage = firstPage;
    }

    /**
     * 计算上一页
     * @return
     */
    public Integer getPrePage() {
        return this.getCurrentPage() == this.getFirstPage() ? 1 : this.getCurrentPage() - 1;
    }

    public void setPrePage(Integer prePage) {
        this.prePage = prePage;
    }

    /**
     * 计算下一页
     * @return
     */
    public Integer getNextPage() {
        return this.getCurrentPage() == this.getTotalPage() ?
                this.getTotalPage()
                : this.getCurrentPage() + 1;
    }

    public void setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getVernier() {
        return vernier;
    }

    public void setVernier(Integer vernier) {
        this.vernier = vernier;
    }

    public void setNowVernier(Integer currentPage) {
        this.vernier = (currentPage-1) * this.pageSize;
    }

    public Integer getAllTotalPage(){
       return this.getTotalCount() % this.getPageSize() == 0 ?
                this.getTotalCount() / this.getPageSize()
                : this.getTotalCount() / this.getPageSize() + 1;
    }

}
