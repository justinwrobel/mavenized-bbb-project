package com.example.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping( "/springContent" )
public class HomeController 
{
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);//slf4j
	
	@RequestMapping
	public String home(Locale locale, Model model) {
		logger.trace("begin home()");
		
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		logger.trace("end home()");
		return "home";
	}

}
