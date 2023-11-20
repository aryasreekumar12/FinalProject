package com.demo.repository;

import com.demo.entity.TestDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITestDetailsRepository extends JpaRepository<TestDetails, Integer> {
  
}
