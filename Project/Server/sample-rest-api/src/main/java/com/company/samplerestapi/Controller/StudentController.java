package com.company.samplerestapi.Controller;


import com.company.samplerestapi.Services.StudentService;
import com.company.samplerestapi.Model.Student;
import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired // this is reference not object
    StudentService studentServices;


//    http://localhost:8082/students
    @RequestMapping(method = RequestMethod.GET,value = "/students")
    public List<Student> getAllStudents()
    {
        return studentServices.getAllStudents();
    }



//GET
//    @RequestMapping("/student/{r_no}")//GET method by default
    @RequestMapping(method = RequestMethod.GET,value = "/student/{email}")
    public Optional<Student> stuInfo(@PathVariable String email)
    {
        return studentServices.getStudentInfo(email);

    }



//POST
    // create student
    @RequestMapping(method =RequestMethod.POST,value = "/students")
    public Student addStudent(@RequestBody Student stu)
    {
        studentServices.addStudent(stu);
        return stu;
    }



//    PUT
    @RequestMapping(method = RequestMethod.PUT,value = "/student/{email}")
    public Optional<Student> editStudent(@PathVariable String email,@RequestBody Student student)
    {
        return studentServices.editStudent(email,student);

    }



//    Delete

    @RequestMapping(method = RequestMethod.DELETE,value = "/student/{email}")
    public Optional<Student> deleteStudent(@PathVariable String email)
    {
        return studentServices.deleteStudent(email);

    }




}
