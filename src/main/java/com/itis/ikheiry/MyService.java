package com.itis.ikheiry;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/ikheiry")
// myservice
public class MyService {
	
	// http://localhost:8880/MyGCPSpingBoot-0.0.1-SNAPSHOT/addition?a=1&b=6
	@RequestMapping("/addition")
	public float addition(@RequestParam("a") float a, @RequestParam("b") float b){
		return a + b;
	}
	
	// http://localhost:8880/MyGCPSpingBoot-0.0.1-SNAPSHOT/welcome
	@RequestMapping("/welcome")
	public String sayWelcome(){
		return "Ismail KHEIRY <br/> Welcome to My first Google Cloud Platform web service test.";
	}
	
}
