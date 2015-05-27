package com.gary.test.ws.test;  
  
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;  
  
import com.gary.test.ws.service.GreetingService;  
  
public class TestGreetingService {  
    //git 2015-5-27 第一次修改
    public static void main(String[] args) {  
        //创建WebService客户端代理工厂  
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();  
        //注册WebService接口  
        factory.setServiceClass(GreetingService.class);  
        //设置WebService地址  
        factory.setAddress("http://localhost:8088/testWebService/GreetingService");  
        GreetingService greetingService = (GreetingService)factory.create();  
        System.out.println("invoke webservice...");  
        System.out.println("message context is:"+greetingService.greeting("额的userName"));     
    }  
} 