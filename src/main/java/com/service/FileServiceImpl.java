package com.service;/********************************************************************
 /**
 * @Project: zyht_web
 * @Package com.service
 * @author wangzhenxin
 * @date 2017-10-09 18:28
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import com.dao.MybatisFileDao;
import com.domain.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wangzhenxin
 * @ClassName FileServiceImpl
 * @Description 类描述
 * @date 2017-10-09
 */
@Service("fileService")
@Transactional
public class FileServiceImpl implements FileService {
//   定义文件Dao对象
    @Autowired
    private MybatisFileDao mybatisFileDao;

    @Override
    public void insertFile(File file) {
//        save(file);
        mybatisFileDao.insertFile(file);
    }

    @Override
    public File findFile(Long id) {
//        return fileDao.findFile(id);
        return mybatisFileDao.getFile(id);
    }
}
