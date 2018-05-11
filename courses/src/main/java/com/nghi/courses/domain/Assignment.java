package com.nghi.courses.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nghi.courses.domain.Course;
@Entity
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Lob
    private String link;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "courseid")
    private Course course;
    
	
    
    public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getLink() {
		return link;
	}



	public void setLink(String link) {
		this.link = link;
	}



	public Course getCourse() {
		return course;
	}



	public void setCourse(Course course) {
		this.course = course;
	}






	public Assignment(String name, String link, Course course) {
		super();
		this.name = name;
		this.link = link;
		this.course = course;
	}



	public Assignment() {}
}
