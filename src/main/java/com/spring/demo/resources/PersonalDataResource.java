package com.spring.demo.resources;

import com.spring.demo.entities.PersonalData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(value = "personal-data")
public interface PersonalDataResource {

    @GetMapping
    ResponseEntity<List<PersonalData>> searchPersonalData();

    @PostMapping
    ResponseEntity<PersonalData> createPersonalData(@RequestBody PersonalData personalData);

}
