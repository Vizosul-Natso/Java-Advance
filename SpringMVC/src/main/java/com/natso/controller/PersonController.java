package com.natso.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.natso.entity.Person;


@Controller
public class PersonController {	
	
	@RequestMapping("/")
	@ResponseBody
	public String homepage() {
		
		return "index.jsp";
	}
	
	@RequestMapping("addPerson")
	public String addPreson(HttpServletRequest req) {
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		
		HttpSession session = req.getSession();
		session.setAttribute("name", name);
		session.setAttribute("id", id);
			
		return "result.jsp";
	}

}
