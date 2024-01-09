package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
@RestController

public class StudentController {
      //get all the students
	@Autowired
	StudentRepository repo;
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
	List<Student>students =	repo.findAll();
		return students;
		
	}
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {
		Student student = repo.findById(id).get();
		return student;
	}
	@PostMapping("/students/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void createStudent(@RequestBody Student student) {
		repo.save(student);
	}
	
	@PutMapping("/students/update/{id}")
	public Student updateStudents(@PathVariable int id) {
		Student student = repo.findById(id).get();
		student.setName("Poonam");
		repo.save(student																											);
		return student;						
		
	}
	@DeleteMapping("/students/delete/{id}")
	public void removeStudent(@PathVariable int id) {
		Student student = repo.findById(id).get();
		repo.delete(student);
	}
	
	
	
}
