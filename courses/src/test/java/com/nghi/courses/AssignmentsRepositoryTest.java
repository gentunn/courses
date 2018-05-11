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
public class AssignmentsRepositoryTest {
	@Autowired
    private AssignmentsRepository repository;

    @Test
    public void findNameGetCourse() {
        List<Assignment> assignments = repository.findByName("Risk Management");
        
        assertThat(assignments).hasSize(1);
        assertThat(assignments.get(0).getCourse().getName()).isEqualTo("Data Security");
    }
    
    @Test
    public void createNewAssg() {
    	Assignment assg= new Assignment("hi","link", new Course("HTML and CSS", "5", "Haaga-Helia", 2017, "Beginner's guide to HTML and CSS",new Category("Test")));
    	repository.save(assg);
    	assertThat(assg.getId()).isNotNull();
    }    
    
 
    @Test
    public void deleteCourse() {
    	List<Assignment> assg = repository.findByName("Risk Management");
    	repository.delete(assg.get(0));
    	List<Assignment> assgTwo = repository.findByName("first");;
    	assertThat(assgTwo).hasSize(0);
    }   
}
