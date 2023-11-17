package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.demo.entity.Prescription;

public interface IDocPrescRepo extends JpaRepository<Prescription, Integer> {

}
