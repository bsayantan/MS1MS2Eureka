package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.User;

@RestController
public class Controller1 {
	@Autowired
	private RestTemplate rest;
	
	@RequestMapping("/login")
	public ModelAndView home1()
	{
		ModelAndView  modelAndView = new ModelAndView(); 
		  modelAndView.setViewName("Login.html");
	      return modelAndView;
	}
	
	 @RequestMapping("/login/msg")
	  public String loginVerification(User user)
	  {
		 int i=0;
		  System.out.println(user.getUserid()+" "+user.getPassword());
		  String u1 = user.getUserid();
		  String p1 = user.getPassword();
		  String temp=null;
		  String u2=null;
		  String p2=null;
		  temp = rest.getForObject("http://MS2/verification", String.class);
		 System.out.println("y "+temp);
		 String[] strArr = temp.split(",");
		
		  while(i<strArr.length)
		  {
			   u2 =strArr[i++]; 
			
	    	  p2 =strArr[i++];
			 
	    	  if(u1.equals(u2) && p1.equals(p2))
		    	{
	    		  return "Login Successful.This is your dashboard";
		    	}
		  }
		
		  i=0;
		  return "Login fail";
		
		 
	  }

	@RequestMapping("/Index")
	public ModelAndView home()
	{
		ModelAndView  modelAndView = new ModelAndView(); 
		  modelAndView.setViewName("Index.html");
	      return modelAndView;
	}
	
	@RequestMapping("/Index/registration")
	public String signup(User user)
	{
		String temp=null;
		System.out.println(temp);
		System.out.println(user);
		try {
		temp=rest.postForObject("http://MS2/second", user, String.class);
		}
		catch (HttpStatusCodeException e) {
			// TODO: handle exception
			e.getMessage();
		}
		System.out.println(temp);
		return "Registration Successful!";
		
	}
	
	
	
	
	
	
	
	

}
