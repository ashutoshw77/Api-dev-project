package com.ApiDev.demo.dbModel;

import lombok.Data;

import java.util.Date;

@Data
public class SoftwarePurchase {
	
    private Integer id;
    
    private Date date;
    
    private String user;
    
    private String department;
    
    private String software;
    
    private Integer seats;
    
    private Double amount;
    
}
