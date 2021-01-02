package com.itheima.service;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * 包名:com.itheima.service
 *
 * @author Shaowu Tan
 * @Classname ItemsService
 * @Date 2020/12/31 20:08
 */
public interface ItemsService {
    /**
     * @Params: []
     * @Return: java.util.List<com.itheima.pojo.Items>
     * des:查询所有
     */
    List<Items> findAll();
}
