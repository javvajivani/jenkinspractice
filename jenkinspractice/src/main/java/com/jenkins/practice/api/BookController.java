package com.jenkins.practice.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/example")
public class BookController {

	@RequestMapping(path = "/{name}", method = RequestMethod.GET)
	public ResponseEntity<?> getBook(@PathVariable String name) {

		return new ResponseEntity<String>("<h1> Hi " + name + ", Welcome to Jenkins programming. </h1>", HttpStatus.OK);
	}
}
