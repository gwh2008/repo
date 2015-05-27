package com.gary.test.ws.service;

import javax.jws.WebService;

@WebService 
public interface GreetingService { 
   public String greeting(String userName); 
} 
