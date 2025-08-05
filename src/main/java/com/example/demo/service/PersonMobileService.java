package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.PersonPhoneNumberDto;

@Service
public interface PersonMobileService {

	public void addPersonMobile(PersonPhoneNumberDto dto);



}
