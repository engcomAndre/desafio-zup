package com.spring.demo.services.servicesImpl;

import com.spring.demo.entities.PersonalData;
import com.spring.demo.repositories.PersonalDataRepository;
import com.spring.demo.services.PersonalDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalDataServiceImpl implements PersonalDataService {

    @Autowired
    private PersonalDataRepository personalDataRepository;

    @Override
    public PersonalData create(PersonalData personalData) {
        return personalDataRepository.save(personalData);
    }

    @Override
    public List<PersonalData> searchAll() {
        return personalDataRepository.findAll();
    }
}
