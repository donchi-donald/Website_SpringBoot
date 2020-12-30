package com.leprincedoni.Start_Website_Springboot.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PagesController {
	/*
	@GetMapping("/")
	@ResponseBody //considere la valeur return coe reponse ne vient pas me dire que tu cherche un template qui a se nom la
	public String home() {
		return "<h1> hello World </h1>"; //on peut mettre ici tout notre code html
	}
	
	@GetMapping("/")
	public String home() {
		return "pages/home"; 
	}
	
	@GetMapping("/")
	public String home(HttpServletRequest request, ModelMap modelMap) {
		String name = request.getParameter("name");
		name = (name != null && !name.isEmpty()) ? name : "World";
		
		modelMap.put("name", name);
		
		return "pages/home"; 
	} */
	
	@GetMapping("/")
	public String home(@RequestParam(required = false, defaultValue = "World") String name, ModelMap modelMap) {
		

		
		modelMap.put("name", name);
		
		return "pages/home"; 
	}
	
	
}
