package com.alex.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

/**
 * @ClassName:
 * @Description: hello
 * @author: Ouzl
 * @create: 2019-08-27 19:35
 */
@Controller
public class HelloController {


    @RequestMapping("/hello")
    public String SayHello(Model m) throws Exception {
        m.addAttribute("now", DateFormat.getDateInstance().format(new Date()));
        if(false)
        throw new Exception("Something Wrong!");
        return "hello";
    }

    @RequestMapping("/haha")
    public String SayHaha(Model model){
        model.addAttribute("name","Thymeleaf");
        return "haha";
    }




}
