package com.Api_test.API.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class Controllar {
	@GetMapping(path="/GetclassData")
	public SimpleGetConnet SimpleGetConnet() {
		return new SimpleGetConnet("hello");
	}
	@GetMapping(path="/GetclassData/Using-path-Variable/{name}")
	public SimpleGetConnet SimpleGetPathvariable(@PathVariable String name) {
		return new SimpleGetConnet(String.format( "hello %s",name));
	}
	
}
