package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.DataInterface;
import com.example.demo.model.User;

@RestController
public class Controller2 {
	
	@Autowired
	DataInterface d;
	
	@RequestMapping("/second")
	public String home(@RequestBody User user)
	{
		
		System.out.println(user);
		d.save(user);
		//System.out.println(d.findAll());
		//d.findAll();
		return "hello";
	}
	@RequestMapping("/verification")
	public Iterable<User> home4(User user)
	{
		
		//d.findAll(user);
		System.out.println(d.findAll());
		return d.findAll();
	}
	

	
}
