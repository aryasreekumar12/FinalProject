package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.TestList;

public interface ITestListRepository extends JpaRepository<TestList , Integer>{

}
