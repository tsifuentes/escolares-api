package com.applicar.escolares.jpa.repositories;

import com.applicar.escolares.jpa.models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, String> {

}
