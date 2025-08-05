package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PersonPhoneNumberDto;
import com.example.demo.service.PersonMobileService;

@RestController
public class PersonPhoneController {

	@Autowired
	private PersonMobileService personMobileService;

	@PostMapping("/person")
	public String savePerson(@RequestBody PersonPhoneNumberDto dto) {
		personMobileService.addPersonMobile(dto);
		return "Person and phone numbers saved!";
	}
}
