package com.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.entity.TestDetails;
import com.demo.service.ITestDetailsService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class TestDetailsController {

	private ITestDetailsService testDetailsService;

	@Autowired
	public TestDetailsController(ITestDetailsService theTestDetailsService) {
		testDetailsService = theTestDetailsService;
	}

	@GetMapping("/testdetails")
	public List<TestDetails> findAll() {
		System.out.println("From controller");
		return testDetailsService.findAll();
	}

	@GetMapping("/testdetails/{testId}")
	public TestDetails getTestDetails(@PathVariable int testId) {
		TestDetails theTestDetails = testDetailsService.findById(testId);
		if (theTestDetails == null) {
			throw new RuntimeException("test id not found-" + testId);
		}
		return theTestDetails;
	}

	@PostMapping("/testdetails")
	public TestDetails addTestDetails(@RequestBody TestDetails theTestDetails) {
		theTestDetails.setTestId(0);
		testDetailsService.save(theTestDetails);
		return theTestDetails;

	}

	@PutMapping("/testdetails/{testId}")
	public TestDetails updateTestDetails(@PathVariable int testId, @RequestBody TestDetails theTestDetails) {
		TestDetails td = testDetailsService.findById(testId);
		if (theTestDetails == null) {
			throw new RuntimeException("test id not found-" + testId);
		}

		td.setTestId(theTestDetails.getTestId());
		td.setTestName(theTestDetails.getTestName());
		td.setTestPrice(theTestDetails.getTestPrice());
		td.setActive(theTestDetails.isActive());
		testDetailsService.save(td);
		return td;
	}

	@DeleteMapping("/testdetails/{testId}")
	public String deleteTestDetails(@PathVariable int testId) {
		TestDetails theTestDetails = testDetailsService.findById(testId);
		if (theTestDetails == null) {
			throw new RuntimeException("testId not found-" + testId);
		}
		
		testDetailsService.deleteById(testId);
		return "Deleted testId: " + testId;

	}
	
	
}