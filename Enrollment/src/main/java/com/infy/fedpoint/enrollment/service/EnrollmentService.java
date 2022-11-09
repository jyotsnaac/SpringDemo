package com.infy.fedpoint.enrollment.service;



import java.util.List;

import com.infy.fedpoint.enrollment.dto.EnrollmentDetails;



public interface EnrollmentService {

	public EnrollmentDetails getADADetails(String memberId,String progId, String effDate) ;
	
	public List<EnrollmentDetails> getEnrollmentDetailsList(String memberId,String payYear) ;
}
