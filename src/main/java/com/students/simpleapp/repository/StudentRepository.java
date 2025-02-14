package com.students.simpleapp.repository;


import com.students.simpleapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // Additional custom queries can be defined here if needed
}
