package com.demo.jenkins;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

//comment added
	@GetMapping("/home")
	public String getHomePage() {
		return "home";
	}
}
