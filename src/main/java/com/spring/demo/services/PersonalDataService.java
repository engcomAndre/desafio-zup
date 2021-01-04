package com.spring.demo.services;

import com.spring.demo.entities.PersonalData;

import java.util.List;

public interface PersonalDataService {

    PersonalData createPersonalData(PersonalData personalData);

    List<PersonalData> searchPersonalData();

}
