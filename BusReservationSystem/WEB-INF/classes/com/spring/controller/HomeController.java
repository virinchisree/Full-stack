package com.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@Autowired
	MainService service;
	
	@RequestMapping("/")
	public String Home()
	{
		return "Homepage";
	}
	
	@RequestMapping("/openticketbooking")
	public String Booking(Model m)
	{
		m.addAttribute("book" , new BookingBean());
		return "Bookingpage";
	}
	
	@RequestMapping("/ticketbooking")
	public String TicketBooking(@ModelAttribute("book")@Valid BookingBean bean , BindingResult result , Model m)
	{
		if(result.hasErrors()) {
			return "Bookingpage";
		}
		else
		{
			String msg = service.TicketBooking(bean);
			if(msg.contains(Constants.SUCCESS)) {
				m.addAttribute("msg","the booking of ticket has been succsfull");
				return "Success";
			}
			else {
				m.addAttribute("msg","there has been an error");
				return "Error";
			}
		}
	}

}
