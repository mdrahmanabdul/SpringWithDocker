package com.springwithdocker;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring-with-docker")
public class MyController {

	@GetMapping("/hello")
	public ResponseEntity<String> greet(){
		return ResponseEntity.status(HttpStatus.OK).body("Hello from EC2 instance !");
	}
}
