package com.teamtreehouse.giflib.controller;

import com.teamtreehouse.giflib.data.CategoryRespository;
import com.teamtreehouse.giflib.data.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by eric.mcdowell on 3/13/17.
 */
@Controller
public class CategoryController {
    @Autowired
    CategoryRespository categoryRespository;

    @Autowired
    GifRepository gifRepository;

    @RequestMapping("/categories")
    public String listCategories(ModelMap modelMap) {
        modelMap.put("categories", categoryRespository.getAllCategories());
        return "categories";
    }

    @RequestMapping("/category/{id}")
    public String category(@PathVariable int id, ModelMap modelMap) {
        modelMap.put("category", categoryRespository.findById(id));
        modelMap.put("gifs", gifRepository.findByCategoryId(id));
        return "category";
    }
}
