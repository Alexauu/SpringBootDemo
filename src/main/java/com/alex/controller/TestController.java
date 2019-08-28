package com.alex.controller;

import com.alex.mapper.CategoryMapper;
import com.alex.pojo.Category;
import com.alex.pojo.CategoryExample;
import com.alex.pojo.Product;
import com.sun.media.sound.MidiOutDeviceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName:
 * @Description:
 * @author: Ouzl
 * @create: 2019-08-28 15:27
 */

@Controller
public class TestController {

    @Autowired
    CategoryMapper categoryMapper;

    @RequestMapping("/test")
    public String test(Model model) {

        String htmlContent = "<p style = 'color:red'>此处应该变红</p>";
        Product currentProduct = new Product(5, "MacBookPro", 200);
        List<Category> list = categoryMapper.selectByExample(new CategoryExample());

        model.addAttribute("list",list);
        model.addAttribute("htmlContent", htmlContent);
        model.addAttribute("currentProduct", currentProduct);
        model.addAttribute("testBoolean", true);
        return "test";
    }
}
