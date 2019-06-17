package cn.itcast.controller;

import cn.itcast.domain.Item;
import cn.itcast.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemService itemService;

    @RequestMapping("/findById")
    public String findById(Model model){
        Item item = itemService.findById(2);
        model.addAttribute("item",item);
        return "result";
    }
}
