package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.PatientDetails;
import com.demo.entity.TestReport;

public interface IDocReport extends JpaRepository <TestReport, Integer>{

}
