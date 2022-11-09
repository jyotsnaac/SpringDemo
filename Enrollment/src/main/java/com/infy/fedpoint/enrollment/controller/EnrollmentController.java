package com.infy.fedpoint.enrollment.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.fedpoint.enrollment.dto.EnrollmentDetails;
import com.infy.fedpoint.enrollment.dto.RequestParameters;
import com.infy.fedpoint.enrollment.service.EnrollmentService;


@RestController
public class EnrollmentController {
	@Autowired
	EnrollmentService enrollmentService;
	
	@GetMapping("/getADADetails")
	public EnrollmentDetails getADADetailsList(@RequestBody RequestParameters rq) {

		String memberId = rq.getStrMemberId();
		String progId = rq.getStrProgramId();
		String effDate = rq.getEff_date();
			
		EnrollmentDetails enrollmentDetails= enrollmentService.getADADetails(memberId,progId,effDate);
		return enrollmentDetails;

	}
	
	@GetMapping("/getEnrollmentDetails")
	public List<EnrollmentDetails> getEnrollmentDetailsList(@RequestBody RequestParameters rq) {

		String memberId = rq.getStrMemberId();
		String payYear = rq.getPay_year();
	
		List<EnrollmentDetails> enrollmentDetailsList = enrollmentService.getEnrollmentDetailsList(memberId,payYear);
		return enrollmentDetailsList;

	}
	

}
