package com.restdemo.springRest.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.restdemo.springRest.entities.Subject;

public interface SubjectDao  extends JpaRepository<Subject, Long>{

}
