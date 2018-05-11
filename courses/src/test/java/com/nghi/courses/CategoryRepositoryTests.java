package com.nghi.courses;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.nghi.courses.domain.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CategoryRepositoryTests {
    @Autowired
    private CategoryRepository repository;

    @Test
    public void findByNameShouldReturnName() {
        List<Category> categories = repository.findByName("Misc");
        
        assertThat(categories).hasSize(1);
        assertThat(categories.get(0).getName()).isEqualTo("Misc");;
    }
    
    @Test
    public void createNewCategory() {
    	Category category = new Category("Sports");
    	repository.save(category);
    	assertThat(category.getCategoryId()).isNotNull();
    }   
    @Test
    public void deleteCategory() {
    	List<Category> categories = repository.findByName("Misc");
    	repository.delete(categories.get(0));
    	List<Category> categorieTwo = repository.findByName("Misc");
    	assertThat(categorieTwo).hasSize(0);
    }     
}
