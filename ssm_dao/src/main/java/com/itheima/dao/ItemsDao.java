package com.itheima.dao;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * 包名:com.itheima.dao
 *
 * @author Shaowu Tan
 * @Classname ItemsDao
 * @Date 2020/12/31 19:25
 */
public interface ItemsDao {
    /**
    * @Params: []
    * @Return: java.util.List<com.itheima.pojo.Items>
    * des:查询所有
    */
    List<Items> findAll();
}
