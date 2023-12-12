package com.uttara.test;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomepageController {

	@Autowired
	private MainService service;
	
	@RequestMapping("/")
	public String Home() {
		
		return "home";
	}
	
	@RequestMapping("/openregisterview")
	public String registerview(Model m) {
		
		m.addAttribute("reg" , new RegBean());
		return "register";
	}
	
	@RequestMapping("/register")
	public String register(@ModelAttribute("reg")@Valid RegBean bean,BindingResult result,Model m) {
		
		if(result.hasErrors())
			return "register";
		else {
			String msg = service.register(bean);
			if(msg.equals(Constants.SUCCESS))
			{
				m.addAttribute("msg", "you have been successfully registered");
				return "success";
			}
			else {
				m.addAttribute("errormsg", msg);
				return "error";
			}
		}
	}
	
	@RequestMapping("/openloginview")
	public String loginview(Model m) {
		
		m.addAttribute("log",new LogBean());
		return "login";
	}
}
