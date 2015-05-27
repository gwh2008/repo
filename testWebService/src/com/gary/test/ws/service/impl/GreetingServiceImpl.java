package com.gary.test.ws.service.impl;

import java.util.Calendar;

import javax.jws.WebService;

import com.gary.test.ws.service.GreetingService;

@WebService(endpointInterface = "com.gary.test.ws.service.GreetingService") 
public class GreetingServiceImpl implements GreetingService { 

   public String greeting(String userName){
	   String result = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
	   result += "<nav>";
		result += "<cpdm>"+userName+1+"</cpdm>";
		result += "<dwjz>"+userName+2+"</dwjz>";
		result += "<ljjz>"+userName+3+"</ljjz>";
		result += "<jzrq>"+userName+4+"</jzrq>";
		result += "</nav>";
       
		/*List<UtilFundNavDTO> list = utilFundNavDAO.getWSResultList(userName);
		for(UtilFundNavDTO dto : list){
			result += "<nav>";
			result += "<cpdm>"+dto.getCpdm()+"</cpdm>";
			result += "<dwjz>"+dto.getDwjz()+"</dwjz>";
			result += "<ljjz>"+dto.getLjjz()+"</ljjz>";
			result += "<jzrq>"+dto.getJzrq()+"</jzrq>";
			result += "</nav>";
		}*/
		
		return result;
       //return "Hello " + userName + ", currentTime is " + Calendar.getInstance().getTime(); 
   } 
} 
