package com.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;



import com.demo.entity.PatientDetails;



public interface IReceptionistRepository extends JpaRepository<PatientDetails, Integer> {



}