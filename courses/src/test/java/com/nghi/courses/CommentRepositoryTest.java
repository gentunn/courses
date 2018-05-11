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
public class CommentRepositoryTest {
	@Autowired
    private CommentRepository repository;

    @Test
    public void findNameGetCourse() {
        List<Comment> comments = repository.findByName("first");
        
        assertThat(comments).hasSize(1);
        assertThat(comments.get(0).getCourse().getName()).isEqualTo("Web Development");
    }
    
    @Test
    public void createNewCourse() {
    	Comment cmt= new Comment("hi", new Course("HTML and CSS", "5", "Haaga-Helia", 2017, "Beginner's guide to HTML and CSS",new Category("Test")));
    	repository.save(cmt);
    	assertThat(cmt.getId()).isNotNull();
    }    
    
 
    @Test
    public void deleteCourse() {
    	List<Comment> cmt = repository.findByName("first");
    	repository.delete(cmt.get(0));
    	List<Comment> cmtTwo = repository.findByName("first");;
    	assertThat(cmtTwo).hasSize(0);
    }   
}
