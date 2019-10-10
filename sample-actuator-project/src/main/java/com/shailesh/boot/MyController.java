package com.shailesh.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/")
public class MyController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello ";

	}

}