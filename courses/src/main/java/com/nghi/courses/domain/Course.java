package com.nghi.courses.domain;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Lob;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    private String grades;
    private String source;
    private int year;
    @Lob
    private String description;
    
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "course")
	private List<Assignment> assignments;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "course")
	private List<Comment> comments;



    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "categoryid")
    private Category category;






   
public Course(String name, String grades, String source, int year, String description, 
			Category category) {
		super();
		this.name = name;
		this.grades = grades;
		this.source = source;
		this.year = year;
		this.description = description;
		this.category = category;
	}







public List<Comment> getComments() {
	return comments;
}







public void setComments(List<Comment> comments) {
	this.comments = comments;
}







public Long getId() {
		return id;
	}







	public void setId(Long id) {
		this.id = id;
	}







	public String getName() {
		return name;
	}







	public void setName(String name) {
		this.name = name;
	}







	public String getGrades() {
		return grades;
	}







	public void setGrades(String grades) {
		this.grades = grades;
	}







	public String getSource() {
		return source;
	}







	public void setSource(String source) {
		this.source = source;
	}







	public int getYear() {
		return year;
	}







	public void setYear(int year) {
		this.year = year;
	}







	public String getDescription() {
		return description;
	}







	public void setDescription(String description) {
		this.description = description;
	}







	public List<Assignment> getAssignments() {
		return assignments;
	}







	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}







	public Category getCategory() {
		return category;
	}







	public void setCategory(Category category) {
		this.category = category;
	}







public Course() {}



}