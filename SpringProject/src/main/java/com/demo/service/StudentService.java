package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Student;
import com.demo.repository.StudentRepo;

@Service
public class StudentService {
	 	@Autowired
	    private StudentRepo studentRepo;

	    public Student createStudent(Student student) {
	        return studentRepo.save(student);
	    }

	    public List<Student> getAllStudents() {
	        return studentRepo.findAll();
	    }
}
