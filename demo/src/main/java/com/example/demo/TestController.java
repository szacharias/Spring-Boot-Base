package com.example.demo;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.simple.JSONObject;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@RequestMapping("/hello")
	public String test() {
		
		return "Hello World";
	}

	@RequestMapping("/random")
	public String randomGenerator(){
		JSONObject obj = new JSONObject();
		obj.put("Generated Number" , Math.random());
		return obj.toString();
	}

	@RequestMapping("/random3")
	public String randomGenerator3(){
		JSONObject obj = new JSONObject();
		obj.put("Generated Number" , Math.random());
		return obj.toString();
	}

	@RequestMapping("/test")
	public String handle(Model model) {
		model.addAttribute("msg", "a message from controller");
		return "testView";
	}
}
