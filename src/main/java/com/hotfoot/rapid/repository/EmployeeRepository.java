package com.hotfoot.rapid.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotfoot.rapid.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

	default Employee findOne(Long id) {
        return findById(id).orElse(null);
    }
}
