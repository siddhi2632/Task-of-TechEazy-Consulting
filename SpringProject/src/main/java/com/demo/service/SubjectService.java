package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Subject;
import com.demo.repository.SubjectRepo;

@Service
public class SubjectService 
{
	 	@Autowired
	    private SubjectRepo subjectRepo;

	    public List<Subject> getAllSubjects() {
	        return subjectRepo.findAll();
	    }
}
