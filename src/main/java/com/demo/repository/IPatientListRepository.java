package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.PatientList;

public interface IPatientListRepository extends JpaRepository<PatientList,Integer> {

}
