package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.TestList;


public interface IDocTestRepo extends JpaRepository <TestList, Integer>{

}
