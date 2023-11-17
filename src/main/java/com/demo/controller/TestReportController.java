package com.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.entity.TestReport;
import com.demo.service.ITestReportService;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class TestReportController {

	private ITestReportService testReportService;

	@Autowired
	public TestReportController(ITestReportService thetestReportService) {
		testReportService = thetestReportService;
	}

	@GetMapping("/testreport")
	public List<TestReport> findAll() {
		System.out.println("From controller");
		return testReportService.findAll();
	}

	@GetMapping("/testreport/{PatId}")
	public TestReport getTestReport(@PathVariable int PatId) {
		TestReport theTestReport = testReportService.findById(PatId);
		if (theTestReport == null) {
			throw new RuntimeException("test id not found-" + PatId);
		}
		return theTestReport;
	}

	@PostMapping("/testreport")
	public TestReport addTestReport(@RequestBody TestReport theTestReport) {
		theTestReport.setPatId(0);
		testReportService.save(theTestReport);
		return theTestReport;

	}

//	@PutMapping("/testreport/{PatId}")
//	public TestReport updateTestReport(@PathVariable int PatId, @RequestBody TestReport theTestReport) {
//		TestReport tr = TestReport.findById(PatId);
//		if (theTestReport == null) {
//			throw new RuntimeException("test id not found-" + PatId);
//		}
//
//		td.setTestId(theTestDetails.getTestId());
//		td.setTestName(theTestDetails.getTestName());
//		td.setTestPrice(theTestDetails.getTestPrice());
//		td.setActive(theTestDetails.isActive());
//		testDetailsService.save(tr);
//		return tr;
//	}
	
}