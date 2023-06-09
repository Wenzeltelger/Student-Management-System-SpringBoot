package net.javaguides.studentmanagementsystem.service;

import java.util.List;

import net.javaguides.studentmanagementsystem.entity.Student;

public interface StudentService {
    
    List<Student> getAllList();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);

}
 