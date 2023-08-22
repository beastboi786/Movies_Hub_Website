package com.company.samplerestapi.Repository;

import com.company.samplerestapi.Model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StudentRepository extends CrudRepository<Student,String>
{

}
