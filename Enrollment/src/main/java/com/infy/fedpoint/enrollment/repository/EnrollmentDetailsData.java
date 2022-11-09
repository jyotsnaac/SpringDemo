package com.infy.fedpoint.enrollment.repository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.infy.fedpoint.enrollment.dto.Enrollment;
@Component
public class EnrollmentDetailsData {

	public Map<String, List<Enrollment>> aDADetailsData() {

		  DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("M/d/yyyy");
		  
		List<Enrollment> enrollmentVision = new ArrayList<>();
		enrollmentVision.add(new Enrollment("20007037950", "VIS",LocalDate.parse("9/27/2020", dateTimeFormatter) , 9.5f, "B"));
		enrollmentVision.add(new Enrollment("20007037950", "VIS",LocalDate.parse("1/5/2020", dateTimeFormatter), 9.5f, "B"));
		enrollmentVision.add(new Enrollment("20007037950", "VIS",LocalDate.parse("1/3/2021", dateTimeFormatter), 9.68f, "B"));
		enrollmentVision.add(new Enrollment("20007037950", "VIS",LocalDate.parse("1/2/2022", dateTimeFormatter), 9.86f, "B"));
		enrollmentVision.add(new Enrollment("20007037950", "VIS",LocalDate.parse("1/2/2023", dateTimeFormatter), 10.86f, "B"));

		List<Enrollment> enrollmentDental = new ArrayList<>();
		enrollmentDental.add(new Enrollment("10000003576", "DEN",LocalDate.parse("8/9/2021", dateTimeFormatter) , 12.99f, "B"));
		enrollmentDental.add(new Enrollment("10000003576", "DEN",LocalDate.parse("1/2/2022", dateTimeFormatter), 13.05f, "B"));
		enrollmentDental.add(new Enrollment("10000003576", "DEN",LocalDate.parse("11/7/2021", dateTimeFormatter), 12.99f, "B"));
		enrollmentDental.add(new Enrollment("10000003576", "DEN",LocalDate.parse("11/21/2021", dateTimeFormatter), 12.99f, "B"));
		enrollmentDental.add(new Enrollment("10000003576", "DEN",LocalDate.parse("3/1/2022", dateTimeFormatter), 28.28f, "M"));
		enrollmentDental.add(new Enrollment("10000003576", "DEN",LocalDate.parse("2/27/2022", dateTimeFormatter), 13.05f, "B"));
		enrollmentDental.add(new Enrollment("10000003576", "DEN",LocalDate.parse("4/1/2022", dateTimeFormatter), 28.28f, "M"));
		enrollmentDental.add(new Enrollment("10000003576", "DEN",LocalDate.parse("1/1/2023", dateTimeFormatter), 29.28f, "M"));

		Map<String, List<Enrollment>> enrollmentList = new HashMap<>();

		enrollmentList.put("VIS", enrollmentVision);
		enrollmentList.put("DEN", enrollmentDental);

		return enrollmentList;
	}

	public List<Enrollment> getADADetails(String progId) {

		Map<String, List<Enrollment>> enrollmentData = aDADetailsData();
		List<Enrollment> enrollmentDetails = enrollmentData.get(progId);		
		return enrollmentDetails;

	}
	
	
	public Map<String, List<Enrollment>> enrollmentDetailsData() {

		  DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("M/d/yyyy");
		  
		List<Enrollment> enrollmentList = new ArrayList<>();
		enrollmentList.add(new Enrollment("20007037950", "VIS",LocalDate.parse("9/27/2020", dateTimeFormatter) , 9.5f, "B"));
		enrollmentList.add(new Enrollment("20007037950", "VIS",LocalDate.parse("1/5/2020", dateTimeFormatter), 9.5f, "B"));
		enrollmentList.add(new Enrollment("20007037950", "VIS",LocalDate.parse("1/3/2021", dateTimeFormatter), 9.68f, "B"));
		enrollmentList.add(new Enrollment("20007037950", "VIS",LocalDate.parse("1/2/2022", dateTimeFormatter), 9.86f, "B"));
		enrollmentList.add(new Enrollment("20007037950", "VIS",LocalDate.parse("1/2/2023", dateTimeFormatter), 10.86f, "B"));
		enrollmentList.add(new Enrollment("10000003576", "DEN",LocalDate.parse("8/9/2021", dateTimeFormatter) , 12.99f, "B"));
		enrollmentList.add(new Enrollment("10000003576", "DEN",LocalDate.parse("1/2/2022", dateTimeFormatter), 13.05f, "B"));
		enrollmentList.add(new Enrollment("10000003576", "DEN",LocalDate.parse("11/7/2021", dateTimeFormatter), 12.99f, "B"));
		enrollmentList.add(new Enrollment("10000003576", "DEN",LocalDate.parse("11/21/2021", dateTimeFormatter), 12.99f, "B"));
		enrollmentList.add(new Enrollment("10000003576", "DEN",LocalDate.parse("3/1/2022", dateTimeFormatter), 28.28f, "M"));
		enrollmentList.add(new Enrollment("10000003576", "DEN",LocalDate.parse("2/27/2022", dateTimeFormatter), 13.05f, "B"));
		enrollmentList.add(new Enrollment("10000003576", "DEN",LocalDate.parse("4/1/2022", dateTimeFormatter), 28.28f, "M"));
		enrollmentList.add(new Enrollment("10000003576", "DEN",LocalDate.parse("1/1/2023", dateTimeFormatter), 29.28f, "M"));

		Map<String, List<Enrollment>> enrollmentMap = new HashMap<>();

		enrollmentMap.put("EnrollmentList", enrollmentList);
		
		return enrollmentMap;
	}
	
	
	
	
	
}
