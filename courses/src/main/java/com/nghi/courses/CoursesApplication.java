package com.nghi.courses;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import com.nghi.courses.domain.*;




@SpringBootApplication
public class CoursesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursesApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner courseInitial(CoursesRepository corepository, CategoryRepository crepository, AssignmentsRepository arepository, UserRepository urepository, CommentRepository cmtrepository) {
		return (args) -> {
			/*Category cata1 = new Category("Front-end");
			Category cata2 = new Category("Back-end");
			crepository.save(cata1);
			crepository.save(cata2);
			Course course1= new Course("HTML and CSS", "5", "Haaga-Helia", 2017, "Beginner's guide to HTML and CSS",cata1);
			Course course2= new Course("Server Programming", "4", "Haaga-Helia", 2018, "Beginner's guide to servers",cata2);
			corepository.save(course1);
			corepository.save(course2);
			Assignment assg1 = new Assignment("JDBC","google.com",course2);
			arepository.save(assg1);*/
			// Create users: admin/admin user/user
			User user1 = new User("user", "$2a$04$ZG/AQcX1YeN3SCfsUO3JPe81Wrw3EjlPv1HPTDFofLvLVmGLw8ME.", "USER"); // password
			User user2 = new User("admin", "$2a$04$TatNqynvv8K3BO23YtNB7elnsNeAZSu6zW57ArLc5BQQbPyfvJqvS", "ADMIN"); // passwordAd
			urepository.save(user1);
			urepository.save(user2);
		};
	}
}
