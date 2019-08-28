package com.alex.controller;

import com.alex.mapper.CategoryMapper;
import com.alex.pojo.Category;
import com.alex.pojo.CategoryExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ClassName:
 * @Description:
 * @author: Ouzl
 * @create: 2019-08-27 23:20
 */

@Controller
public class CategoryController {

    @Autowired
    CategoryMapper categoryMapper; //Mybatis

    @RequestMapping(value = "/categories",method = RequestMethod.GET)
    public String listCategory(Model model,
                               @RequestParam(value = "start", defaultValue = "0") int start,
                               @RequestParam(value = "size", defaultValue = "5") int size) throws Exception{
        CategoryExample categoryExample = new CategoryExample();
        categoryExample.createCriteria();
        List<Category> list = categoryMapper.selectByExample(categoryExample);
        PageHelper.startPage(start,size,"id asc"); //分页小助手
        PageInfo<Category> pageInfo = new PageInfo<>(list);
        model.addAttribute("page",pageInfo);
        return "listCategory";
    }

    @RequestMapping(value = "/categories",method = RequestMethod.POST)
    public String listCategory(Category c) throws Exception {
        categoryMapper.insert(c);
        return "redirect:/categories";
    }
    @RequestMapping(value = "/categories/{id}",method = RequestMethod.DELETE)
    public String deleteCategory(Category c) throws Exception {
        categoryMapper.deleteByPrimaryKey(c.getId());
        return "redirect:/categories";
    }
    @RequestMapping(value = "/categories/{id}",method = RequestMethod.PUT)
    public String updateCategory(Category c) throws Exception {
        categoryMapper.updateByPrimaryKey(c);
        return "redirect:/categories";
    }
    @RequestMapping(value = "/categories/{id}",method = RequestMethod.GET)
    public String listCategory(@PathVariable("id") int id, Model m) throws Exception {
        Category c= categoryMapper.selectByPrimaryKey(id);
        m.addAttribute("c", c);
        return "editCategory";
    }
}
