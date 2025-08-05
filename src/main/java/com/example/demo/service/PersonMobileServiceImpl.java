package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PersonPhoneNumberDto;
import com.example.demo.entity.Person;
import com.example.demo.entity.PhoneNumber;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonMobileServiceImpl implements PersonMobileService {

    @Autowired
    private PersonRepository personRepo;

    @Override
    public void addPersonMobile(PersonPhoneNumberDto dto) {
        Person p = new Person();
        p.setName(dto.getName());
        p.setEmail(dto.getEmail());
        p.setAddress(dto.getAddress());

        List<PhoneNumber> phoneList = new ArrayList<>();

        for (String phoneStr : dto.getPhoneNumbers()) {
            PhoneNumber phone = new PhoneNumber();
            phone.setNumber(phoneStr);
            phone.setPerson(p); // Link phone number to person
            phoneList.add(phone);
        }

        p.setPhoneNumbers(phoneList); // Add phone numbers to person

        personRepo.save(p); // Save the person with phone numbers
    }
}
