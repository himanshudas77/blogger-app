package com.blogger.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class WriteBlogController {

	@RequestMapping("/new")
	public String newBlog() {
		return "newBlog";
	}

	
}
