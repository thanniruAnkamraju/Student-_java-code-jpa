package com.example.shiva;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
 @Autowired
	private StudentRepository repo;
	
	public List<Student>listAll(){
		return repo.findAll();
	}
	public void save (Student student) {
		repo.save(student);
	}
	
}
