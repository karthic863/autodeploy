package com.hotfoot.rapid.repository;

import org.springframework.data.repository.CrudRepository;

import com.hotfoot.rapid.entity.College;

public interface CollegeRepository extends CrudRepository<College,Long> {

	default College findOne(Long id) {
        return findById(id).orElse(null);
    }
}
