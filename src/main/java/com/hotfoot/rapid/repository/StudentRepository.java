package com.hotfoot.rapid.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotfoot.rapid.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{

	default Student findOne(Long id) {
        return findById(id).orElse(null);
    }
}
