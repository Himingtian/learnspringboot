package com.learnspringboot.springboot01.controller;

import com.learnspringboot.springboot01.pojo.Items;
import com.learnspringboot.springboot01.pojo.User;
import com.learnspringboot.springboot01.service.ItemsService;
import com.learnspringboot.springboot01.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TestMySpring {

    @Resource(name = "userServiceImpl")
    private UserService userService;

    @Resource(name = "itemsServiceImpl")
    private ItemsService itemsService;

    @RequestMapping("/test")
    @ResponseBody
    public String testSpringBoot(){

        return "Hello Springboot010203";
    }

    @RequestMapping("/testfreemarker")
    public String testFreemarker(Model model){
        model.addAttribute("msg","hello freemarker!hahahhhh");
        return "demo";
    }

    @RequestMapping("/getuserall")
    @ResponseBody
    public List<User> findUserAll(){

        return userService.findUserAll();
    }

    @RequestMapping("/getitemsall")
    @ResponseBody
    public List<Items> findItemsAll(){

        return itemsService.findItemsAll();
    }

}
