package com.itheima.ssm.controller;

import com.itheima.ssm.domain.Items;
import com.itheima.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService service;

    @RequestMapping("/showItem")
    public String showItem(Integer id, Model model){
        Items items = service.findById(id);
        model.addAttribute("item" ,items);
        return "success";
    }
}
