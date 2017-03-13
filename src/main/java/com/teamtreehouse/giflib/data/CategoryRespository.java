package com.teamtreehouse.giflib.data;

import com.teamtreehouse.giflib.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by eric.mcdowell on 3/12/17.
 */
@Component
public class CategoryRespository {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
        new Category(1, "Programming"),
        new Category(2, "Funny"),
        new Category(3, "Serious")
    );

    public List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }

    public Category findById(int id) {
        for(Category category : ALL_CATEGORIES) {
            if(category.getId() == id){
                return category;
            }
        }
        return null;
    }
}
