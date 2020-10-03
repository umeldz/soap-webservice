package com.in28minutes.soap.webservices.soapdemo.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.in28minutes.courses.CourseDetails;
import com.in28minutes.courses.GetCourseDetailsRequest;
import com.in28minutes.courses.GetCourseDetailsResponse;

@Endpoint
public class CourseDetailsEndpoint {

	//method
	//input - GetCourseDetailsRequest
	//output - GetCourseDetailsResponse
	//name space http://in28minutes.com/courses
	//name GetCourseDetailsRequest
	@PayloadRoot(namespace = "http://in28minutes.com/courses",
			localPart ="GetCourseDetailsRequest")
	@ResponsePayload
	public GetCourseDetailsResponse processCourseDetailsRequest(@RequestPayload GetCourseDetailsRequest request) {
		GetCourseDetailsResponse response = new GetCourseDetailsResponse();
	
		CourseDetails courseDetails = new CourseDetails();
		courseDetails.setId(request.getId());
		courseDetails.setName("Java in 28 minutes");
		courseDetails.setDescription("Learning java in 28 steps");
		
		
		response.setCourseDetails(courseDetails);
		return response;
	}
	
}
