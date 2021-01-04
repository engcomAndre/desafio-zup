package com.spring.demo.resources.resources_impl;

import com.spring.demo.entities.PersonalData;
import com.spring.demo.resources.PersonalDataResource;
import com.spring.demo.services.PersonalDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class PersonalDataResourceImpl implements PersonalDataResource {

    @Autowired
    private PersonalDataService personalDataService;

    @Override
    public ResponseEntity<List<PersonalData>> search(PersonalData personalData) {
        return ResponseEntity.ok().body(personalDataService.searchAll());
    }
}
