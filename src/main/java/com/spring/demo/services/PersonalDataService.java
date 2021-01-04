package com.spring.demo.services;

import com.spring.demo.entities.PersonalData;

import java.util.List;

public interface PersonalDataService {

    PersonalData create(PersonalData personalData);

    List<PersonalData> searchAll();
}
