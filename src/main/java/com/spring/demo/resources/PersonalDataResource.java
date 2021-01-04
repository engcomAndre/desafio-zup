package com.spring.demo.resources;

import com.spring.demo.entities.PersonalData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface PersonalDataResource {

    @GetMapping
    ResponseEntity<List<PersonalData>> search(PersonalData personalData);
}
