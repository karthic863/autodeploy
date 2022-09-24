package com.hotfoot.rapid.repository;

import org.springframework.data.repository.CrudRepository;

import com.hotfoot.rapid.entity.Department;

public interface DepartmentRepository extends CrudRepository<Department,Long> {

	default Department findOne(Long id) {
        return findById(id).orElse(null);
    }
}
