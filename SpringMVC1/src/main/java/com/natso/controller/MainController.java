package com.natso.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	//Using Model
	
	@RequestMapping(value = "/person" , method = RequestMethod.GET)
	public String getConfirmation(Model m) {
		m.addAttribute("name", "Natso");
		m.addAttribute("age", 27);
		m.addAttribute("job", "developer");
		
		return "person.jsp";
	}
	
	//Using ModelMap
	
	@RequestMapping(value = "/natso" ,method = RequestMethod.GET)
	public String UsingModelAndView (ModelMap map, HashMap<String, Double> hs ) {
		map.putIfAbsent("name", "natso");
		map.putIfAbsent("company", "natsoCo.ltd");
		
		hs.put("Networth", 9999999.99);
		hs.put("assest", 998989.90);
		hs.put("stockprice", 9999999.01);
		
		map.addAllAttributes(hs);
		
		return "natso.jsp";
		
	}
	
	//using modelAndView
	
	@RequestMapping(value="emp", method = RequestMethod.GET)
	public ModelAndView usingModelAndView(ModelAndView mav) {
		mav.addObject("Name", "Kich");
		mav.addObject("Company", "ExcelSoft");
		mav.addObject("Salary", 45000);
		mav.setViewName("emp.jsp");
		return mav;
	}
	

}
