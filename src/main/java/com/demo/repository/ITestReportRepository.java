package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.TestReport;

public interface ITestReportRepository extends JpaRepository<TestReport , Integer>{

}
