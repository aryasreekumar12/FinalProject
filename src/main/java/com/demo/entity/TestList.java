package com.demo.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "test_list")
public class TestList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "test_no")
    private int testNo;

    @Column(name = "pat_id")
    private int patId;

    @ManyToOne
    @JoinColumn(name = "pat_id",insertable=false, updatable=false)
    private PatientDetails patientDetails;

    @Column(name = "stf_id")
    private int stfId;

    @ManyToOne
    @JoinColumn(name = "stf_id",insertable=false, updatable=false)
    private StaffDetails staffDetails;

    @Column(name = "test_id")
    private int testId;

    @ManyToOne
    @JoinColumn(name = "test_id",insertable=false, updatable=false)
    private TestDetails testDetails;

    @Column(name = "is_active")
    private boolean active;

    // Default constructor
    public TestList() {
    }

    // Constructor with parameters
    public TestList(int patId, int stfId, int testId, boolean active) {
        this.patId = patId;
        this.stfId = stfId;
        this.testId = testId;
        this.active = active;
    }

    // Getters and setters

    public int getTestNo() {
        return testNo;
    }

    public void setTestNo(int testNo) {
        this.testNo = testNo;
    }

    public int getPatId() {
        return patId;
    }

    public void setPatId(int patId) {
        this.patId = patId;
    }

    public PatientDetails getPatientDetails() {
        return patientDetails;
    }

    public void setPatientDetails(PatientDetails patientDetails) {
        this.patientDetails = patientDetails;
    }

    public int getStfId() {
        return stfId;
    }

    public void setStfId(int stfId) {
        this.stfId = stfId;
    }

    public StaffDetails getStaffDetails() {
        return staffDetails;
    }

    public void setStaffDetails(StaffDetails staffDetails) {
        this.staffDetails = staffDetails;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public TestDetails getTestDetails() {
        return testDetails;
    }

    public void setTestDetails(TestDetails testDetails) {
        this.testDetails = testDetails;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

