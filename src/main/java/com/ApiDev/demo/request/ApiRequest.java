package com.ApiDev.demo.request;

import lombok.Data;

import java.util.Date;

@Data
public class ApiRequest {
	
	private String startDate;
	
	private String endate;
	
	private String department;
	
	private Integer integer;
	
	private String itemBy;

}
