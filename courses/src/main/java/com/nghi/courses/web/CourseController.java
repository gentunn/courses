package com.nghi.courses.web;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.nghi.courses.domain.*;


@Controller
public class CourseController {
	@Autowired
	 private CoursesRepository repository;
	@Autowired
	private CategoryRepository crepository; 
	@Autowired
	private AssignmentsRepository arepository; 
	@Autowired
	private CommentRepository cmtrepository; 
	
	
	
	@RequestMapping(value="/login")
    public String login() {	
        return "login";
    }
	
   @RequestMapping(value="/index")
   public String courseList(Model model) {	
       model.addAttribute("courses", repository.findAll());
       return "index";
   }
   
   @RequestMapping(value="/courses", method = RequestMethod.GET)
  public @ResponseBody List<Course> courseListRest() {	
       return (List<Course>) repository.findAll();
   }  
   @RequestMapping(value="/categories", method = RequestMethod.GET)
   public @ResponseBody List<Category> cateListRest() {	
        return (List<Category>) crepository.findAll();
    } 
   @RequestMapping(value="/assignments", method = RequestMethod.GET)
   public @ResponseBody List<Assignment> assgListRest() {	
        return (List<Assignment>) arepository.findAll();
    } 
   @RequestMapping(value="/comments", method = RequestMethod.GET)
   public @ResponseBody List<Comment> cmtListRest() {	
        return (List<Comment>) cmtrepository.findAll();
    } 
   @PreAuthorize("hasAuthority('ADMIN')")
   @RequestMapping(value = "/add")
   public String addCourse(Model model){
   	model.addAttribute("course", new Course());
   	model.addAttribute("categories", crepository.findAll());
       return "add";
   }    
   @PreAuthorize("hasAuthority('ADMIN')")
   @RequestMapping(value = "view/addassignment/{id}", method = RequestMethod.GET)
   public String addAssignment(@PathVariable("id") Long courseid,  Model model){
	model.addAttribute("course", repository.findOne(courseid));
   	model.addAttribute("assignment", new Assignment());
       return "addassignment";
   }  
   @RequestMapping(value = "view/addCmt/{id}", method = RequestMethod.GET)
   public String addCmt(@PathVariable("id") Long courseid,  Model model){
	model.addAttribute("course", repository.findOne(courseid));
   	model.addAttribute("comment", new Comment());
       return "addCmt";
   }

   @RequestMapping(value = "/view/{id}")
   public String viewCourse(@PathVariable("id") Long courseid,  Model model) {
	   	model.addAttribute("course", repository.findOne(courseid));
	   	model.addAttribute("categories", crepository.findAll());
	   	model.addAttribute("assignments", arepository.findAll());
	  	 return "view";
	  	 
	   }
   
   
  @RequestMapping(value="/courses/{id}", method = RequestMethod.GET)
   public @ResponseBody Course findCourseRest(@PathVariable("id") Long id) {	
   	return repository.findOne(id);      //findOne() undefined
   } 
 
   @RequestMapping(value = "/save", method = RequestMethod.POST)
   public String save(Course course){
       repository.save(course);
       return "redirect:/view/" + course.getId();
   }    
   
   @RequestMapping(value = "/saveassignment/{id}", method = RequestMethod.POST)
   public String save(@PathVariable("id") Long assgid , Assignment assignment){
       arepository.save(assignment);
       return "redirect:/view/" + assignment.getCourse().getId();
   }    
   @RequestMapping(value = "/saveCmt/{id}", method = RequestMethod.POST)
   public String saveCmt(@PathVariable("id") Long cmtid , Comment comment){
       cmtrepository.save(comment);
       return "redirect:/view/" + comment.getCourse().getId();
   }

   @PreAuthorize("hasAuthority('ADMIN')")
   @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
   public String deleteCourse(@PathVariable("id") Long courseid, Model model) {
   	repository.delete(courseid); //cant do delete(Long courseid) why?
  	 return "redirect:../index";
   }
   @PreAuthorize("hasAuthority('ADMIN')")
   @RequestMapping(value = "/deleteAssg/{id}", method = RequestMethod.GET)
   public String deleteAssg(@PathVariable("id") Long assgid, Model model) {
	Long dummy = arepository.findOne(assgid).getCourse().getId();
   	arepository.delete(assgid); 
   	return "redirect:/view/" + dummy;
   }
   

   @RequestMapping(value = "/deleteCmt/{id}", method = RequestMethod.GET)
   public String deleteCmt(@PathVariable("id") Long cmtid, Model model) {
	Long dummy = cmtrepository.findOne(cmtid).getCourse().getId();
   	cmtrepository.delete(cmtid); 
   	return "redirect:/view/" + dummy;
   }
   
   
   @PreAuthorize("hasAuthority('ADMIN')")
   @RequestMapping(value = "/edit/{id}")
   public String editCourse(@PathVariable("id") Long courseid,  Model model) {
   	model.addAttribute("course", repository.findOne(courseid));
   	model.addAttribute("categories", crepository.findAll());
  	 return "edit";
  	 
   }

}
