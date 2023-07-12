package com.example.shiva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@CrossOrigin
@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	@GetMapping("stu")
	List<Student> List(){
  return service.listAll();
	
	}
	@PostMapping("/stu")
	public List<Student> add(@RequestBody Student student){
	service.save(student);	
	return service.listAll();
	}
}
