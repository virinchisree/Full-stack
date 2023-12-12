package com.uttara.spring.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uttara.spring.services.SpService;
import com.uttara.spring.util.Constants;

@Controller
public class HomeController {

	@Autowired
	SpService service;
	
	@RequestMapping("/")
	public String showHome()
	{
		return "Home";
	}
	@RequestMapping("/openRegisterView")
	public String showRegisterView(Model model)
	{
		RegBean bean = new RegBean();
		model.addAttribute("reg",bean);
		return "Register";
	}
	
	@RequestMapping("/register")
	public String register(@ModelAttribute("reg") @Valid RegBean bean,BindingResult results, Model model)
	{
		System.out.println("in HC->register() bean = "+bean);
		
		if(results.hasErrors())
			return "Register";
		else
		{
			//ask service to register bean
			String msg = service.register(bean);
			if(msg.equals(Constants.SUCCESS))
			{
				model.addAttribute("msg", "Registration Succeeded!!");
				return "Display";
			}
			else
			{
				model.addAttribute("errorMsg", "Registration failed!! Message is "+msg);
				return "Register";
			}
		}
	}
}






