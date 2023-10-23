package com.EMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EMS.entity.Employee;

@Repository
public interface EMPRepository extends JpaRepository<Employee, Integer> {

}