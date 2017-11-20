package com.service;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package mobile_package.service
 * @author wangzhenxin
 * @date 2017-08-20 12:13
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */


import com.domain.Messages;

import java.util.List;

/**
 * @author wangzhenxin
 * @InterfaceName MessagesService
 * @Description 短信service
 * @date 2017-08-20
 */
public interface MessagesService {
    /**
     * @Title:updateMessagesByMessagesList
     * @Description: 根据短信记录集合更新对应的短信记录
     * @author wangzhenxin
     * @date 2017-08-18
     * @param messagesList 短信记录集合
     * @return String
     */
    public String updateMessagesByMessagesList(List<Messages> messagesList);

    /**
     * @Title: saveMessage
     * @Description: 根据短信记录跟新短信记录
     * @author wangzhenxin
     * @date 2017-09-26
     */

    public String saveMessage(Messages messages);

    /**
     * @Title: findAllMessage
     * @Description: 根据客户ID查询所有短信记录
     * @author wangzhenxin
     * @date 2017-10-26
     * @param id 客户ID
     * @return List<Messages>
     */

    public List<Messages> findAllMessage(Long id);
}
