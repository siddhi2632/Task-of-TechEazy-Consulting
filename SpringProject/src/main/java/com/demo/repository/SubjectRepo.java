package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Subject;

public interface SubjectRepo extends JpaRepository<Subject, Long>{

}
