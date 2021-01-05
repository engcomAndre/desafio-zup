package com.spring.demo.resources.resources_impl;

import com.spring.demo.entities.PersonalData;
import com.spring.demo.resources.PersonalDataResource;
import com.spring.demo.services.PersonalDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class PersonalDataResourceImpl implements PersonalDataResource {

    @Autowired
    private PersonalDataService personalDataService;

    @Override
    public ResponseEntity<List<PersonalData>> searchPersonalData() {
        return ResponseEntity.ok().body(personalDataService.searchPersonalData());
    }

    @Override
    public ResponseEntity<PersonalData> createPersonalData(@Valid PersonalData personalData) {

        personalData = personalDataService.createPersonalData(personalData);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(personalData.getId())
                .toUri();

        return ResponseEntity.created(uri).body(personalData);
    }
}
