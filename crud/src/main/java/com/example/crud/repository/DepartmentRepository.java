package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {}