package com.fjvelasco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PruebaController {
	@RequestMapping("/")
	public String hello(){
		return "hello";
	}
}
