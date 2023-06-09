package net.javaguides.studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.studentmanagementsystem.entity.Student;
import net.javaguides.studentmanagementsystem.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {

        /* 
        Student student1 = new Student("John", "Doe", "john.doe@example.com");
        studentRepository.save(student1);

        Student student2 = new Student("Jane", "Doe", "jane.doe@example.com");
        studentRepository.save(student2);

        Student student3 = new Student("Alice", "Smith", "alice.smith@example.com");
        studentRepository.save(student3);

        */
    }

}
