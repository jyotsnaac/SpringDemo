package com.infy.fedpoint.enrollment.service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.infy.fedpoint.enrollment.dto.Enrollment;
import com.infy.fedpoint.enrollment.dto.EnrollmentDetails;
import com.infy.fedpoint.enrollment.repository.EnrollmentDetailsData;

@Component
public class EnrollmentServiceImpl implements EnrollmentService {

	@Autowired
	Enrollment enrollment;

	@Autowired
	EnrollmentDetailsData enrollmentDetailsData;

	@Override
	public EnrollmentDetails getADADetails(String memberId, String progId, String effDate) {

		float annualDeductionAmount;

		EnrollmentDetails enrollmentDetails = new EnrollmentDetails();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("M/d/yyyy");

		LocalDate date1 = LocalDate.parse(effDate, dateTimeFormatter);
		List<Enrollment> enrollmentDetailsList = enrollmentDetailsData.getADADetails(progId);
	
		enrollmentDetailsList.stream().forEach(System.out::println);

		List<Enrollment> enrollmentList = enrollmentDetailsList.stream()
				.filter(enrollment -> enrollment.getMember_id().equals(memberId))
				.filter(enrollment -> enrollment.getProg_id().equals(progId))
				.filter(enrollment -> enrollment.getEff_date().equals(date1)).collect(Collectors.toList());

		Enrollment enrollment = enrollmentList.get(0);

		annualDeductionAmount = calculateADA(enrollment);		
		enrollmentDetails.setMember_id(enrollment.getMember_id());
		enrollmentDetails.setProg_id(enrollment.getProg_id());
		enrollmentDetails.setEff_date(enrollment.getEff_date().format(dateTimeFormatter));
		enrollmentDetails.setaDA(annualDeductionAmount);
		

		return enrollmentDetails;

	}

	public float calculateADA(Enrollment enrollment) {

		float annualdedAmt = 0.f;

		if (enrollment.getFrequency().equals("B")) {			
			annualdedAmt = enrollment.getDed_amt() * 26;
		} else if (enrollment.getFrequency().equals("M")) {
			annualdedAmt = enrollment.getDed_amt() * 12;			
		}
		return annualdedAmt;
	}

	@Override
	public List<EnrollmentDetails> getEnrollmentDetailsList(String memberId, String payYear) {

		List<EnrollmentDetails> enrollmentDetailsList = new ArrayList<>();
		Map<String, List<Enrollment>> enrollmentDetailsData2 = enrollmentDetailsData.enrollmentDetailsData();

		List<Enrollment> list = enrollmentDetailsData2.get("EnrollmentList");
		int year = Integer.parseInt(payYear);

		for (Enrollment e : list) {

			if ((e.getMember_id().equals(memberId)) && (e.getEff_date().getYear() == year)) {

				EnrollmentDetails enrollmentDetails = new EnrollmentDetails();
				enrollmentDetails.setMember_id(e.getMember_id());
				enrollmentDetails.setProg_id(e.getProg_id());
				enrollmentDetails.setEff_date(e.getEff_date().toString());
				enrollmentDetails.setaDA(calculateADA(e));
				enrollmentDetailsList.add(enrollmentDetails);
			}

		}
		return enrollmentDetailsList;
	}

}