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
public class CoursesRepositoryTest {
	@Autowired
    private CoursesRepository repository;

    @Test
    public void findNameGetCate() {
        List<Course> courses = repository.findByName("Finnish 3");
        
        assertThat(courses).hasSize(1);
        assertThat(courses.get(0).getCategory().getName()).isEqualTo("Languages");
    }
    
    @Test
    public void createNewCourse() {
    	Course course = new Course("HTML and CSS", "5", "Haaga-Helia", 2017, "Beginner's guide to HTML and CSS",new Category("Test"));
    	repository.save(course);
    	assertThat(course.getId()).isNotNull();
    }    
    
 
    @Test
    public void deleteCourse() {
    	List<Course> courses = repository.findByName("Finnish 3");
    	repository.delete(courses.get(0));
    	List<Course> courseTwo = repository.findByName("Finnish 3");;
    	assertThat(courseTwo).hasSize(0);
    }   
}
