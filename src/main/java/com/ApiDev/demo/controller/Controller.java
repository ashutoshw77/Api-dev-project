package com.ApiDev.demo.controller;


import com.ApiDev.demo.request.ApiRequest;
import com.ApiDev.demo.response.BaseResponse;
import com.ApiDev.demo.response.SystemError;
import com.ApiDev.demo.services.ApiService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class Controller {

	private ApiService apiService;

	public Controller(ApiService apiService) {
		this.apiService = apiService;
	}

	@GetMapping("/importCSV")
	public BaseResponse importCSV() throws Exception{
		BaseResponse responseStatus = new BaseResponse(SystemError.OK);
		responseStatus.setResponse(apiService.importCSV());
		return responseStatus;

	}

	@PostMapping("/total_items")
	public BaseResponse totalItems(@RequestBody ApiRequest apiRequest) throws Exception{
		BaseResponse responseStatus = new BaseResponse(SystemError.OK);
		responseStatus.setResponse(apiService.getTotalItems(apiRequest));
		return responseStatus;

	}

	@PostMapping("/nth_most_total_item")
	public BaseResponse nthMostTotalItem(@RequestBody ApiRequest apiRequest) throws Exception{
		BaseResponse responseStatus = new BaseResponse(SystemError.OK);
		responseStatus.setResponse(apiService.getNthMostTotalItem(apiRequest));
		return responseStatus;

	}

	@PostMapping("/percentage_of_department_wise_sold_items")
	public BaseResponse percentageOfDepartmentWiseSoldItems(@RequestBody ApiRequest apiRequest) throws Exception{
		BaseResponse responseStatus = new BaseResponse(SystemError.OK);
		responseStatus.setResponse(apiService.getPercentageOfDepartmentWiseSoldItems(apiRequest));
		return responseStatus;

	}

	@PostMapping("/monthly_sales")
	public BaseResponse monthlySales(@RequestBody ApiRequest apiRequest) throws Exception{
		BaseResponse responseStatus = new BaseResponse(SystemError.OK);
		responseStatus.setResponse(apiService.getMonthlySales(apiRequest));
		return responseStatus;

	}
}