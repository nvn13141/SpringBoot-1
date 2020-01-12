package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyService {

	@RequestMapping("/Hello")
	public String hello()
	{
		return "Kishore Devops Training";
	}
	
}
