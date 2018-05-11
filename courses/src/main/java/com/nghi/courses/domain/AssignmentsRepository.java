package com.nghi.courses.domain;
import java.util.List;

import org.springframework.data.repository.CrudRepository;




public interface AssignmentsRepository extends CrudRepository<Assignment, Long> {
	List<Assignment> findByName(String name);
}

