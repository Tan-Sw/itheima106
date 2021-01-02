package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 包名:com.itheima.service.impl
 *
 * @author Shaowu Tan
 * @Classname ItemsServiceImpl
 * @Date 2020/12/31 20:09
 */
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;

    /**
    * @Params: []
    * @Return: java.util.List<com.itheima.pojo.Items>
    * des:查询所有
    */
    @Override
    public List<Items> findAll() {
        return itemsDao.findAll();
    }
}
