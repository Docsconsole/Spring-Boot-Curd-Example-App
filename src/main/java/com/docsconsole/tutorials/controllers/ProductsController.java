package com.docsconsole.tutorials.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/curd-app/api")
public class ProductsController {

	@GetMapping("/all")
	public String allAccess() {
		return "Access Type: All";
	}

}
