package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


/**
 * 包名:com.itheima.controller
 *
 * @author Shaowu Tan
 * @Classname ItemsController
 * @Date 2020/12/31 21:13
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    /**
    * @Params: [model]
    * @Return: java.lang.String
    * des:查询所有
    */
    @GetMapping("list")
    public String findAll(Model model){
        List<Items> items = itemsService.findAll();
        model.addAttribute("items",items);
        return "items";
    }
}
