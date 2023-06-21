package com.ApiDev.demo.services;


import com.ApiDev.demo.dbModel.SoftwarePurchase;
import com.ApiDev.demo.request.ApiRequest;

import java.util.List;

public interface ApiService {
	
	public List<SoftwarePurchase> importCSV() throws Exception;
	
	public Object getTotalItems(ApiRequest apiRequest) throws Exception;
	
	public Object getNthMostTotalItem(ApiRequest apiRequest) throws Exception;
	
	public Object getPercentageOfDepartmentWiseSoldItems(ApiRequest apiRequest) throws Exception;
	
	public Object getMonthlySales(ApiRequest apiRequest) throws Exception;

}
