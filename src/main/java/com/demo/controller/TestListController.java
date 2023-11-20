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
import com.demo.entity.TestList;
import com.demo.service.ITestListService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class TestListController {

	private ITestListService testListService;

	@Autowired
	public TestListController(ITestListService thetestListService) {
		testListService = thetestListService;
	}

	@GetMapping("/testlist")
	public List<TestList> findAll() {
		System.out.println("From controller");
		return testListService.findAll();
	}

	@GetMapping("/testlist/{PatId}")
	public TestList getTestList(@PathVariable int PatId) {
		TestList theTestList = testListService.findById(PatId);
		if (theTestList == null) {
			throw new RuntimeException("test id not found-" + PatId);
		}
		return theTestList;
	}

	@PostMapping("/testlist")
	public TestList addTestList(@RequestBody TestList theTestList) {
		theTestList.setPatId(0);
		testListService.save(theTestList);
		return theTestList;

	}

//	@PutMapping("/testlist/{PatId}")
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