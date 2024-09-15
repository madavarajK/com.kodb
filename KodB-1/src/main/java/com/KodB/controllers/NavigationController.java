package com.KodB.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {
@GetMapping("/")
public String index() {
	return "index";
}
//Test
@GetMapping("/openSignUp")
public String openSignUp() {
	return "SignUp";
}
@GetMapping("/openCreatePost")
public String openCreatePost() {
	return "createPost";
}

}
