package com.company.samplerestapi.Services;

import com.company.samplerestapi.Model.Student;
import com.company.samplerestapi.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import  java.util.*;

@Service // you cannot create objects of this class only spring can
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    List<Student> students = new ArrayList<>();
    public List<Student> getAllStudents() {

        studentRepository.findAll().forEach(student -> students.add(student));
        return students;
    }

    public Optional<Student> getStudentInfo(String email) {
        return studentRepository.findById(email);
    }
    public void addStudent(Student student) {
        studentRepository.save(student);
    }
    public Optional<Student> editStudent(String email,Student updatedstudent)
    {
//       Optional<Student> oldstu=studentRepository.findById(email);
            studentRepository.deleteById(email);
            studentRepository.save(updatedstudent);
            return studentRepository.findById(email);

//        return oldstu;
    }

    public  Optional<Student> deleteStudent(String email)
    {
        Optional<Student> delstu=studentRepository.findById(email);
        studentRepository.deleteById(email);
        return delstu;
    }





}
