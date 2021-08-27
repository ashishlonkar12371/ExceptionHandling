package com.ashish.ReferenceWithException.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashish.ReferenceWithException.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
