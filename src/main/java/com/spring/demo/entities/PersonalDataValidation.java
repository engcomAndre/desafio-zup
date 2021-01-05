package com.spring.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.time.LocalDate;

import static com.spring.demo.constants.ValidationMessages.*;

@Entity
public class PersonalDataValidation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = NOT_EMPTY_MSG)
    @NotBlank(message = NOT_BLANK_MSG)
    @NotNull(message = NOT_NULL_MSG)
    @Size(min = 5,max = 120,message = NAME_SIZE_MSG)
    private String name;

    @Email(message = EMAIL_MSG)
    @NotEmpty(message = NOT_EMPTY_MSG)
    @NotBlank(message = NOT_BLANK_MSG)
    @NotNull(message = NOT_NULL_MSG)
    private String email;

    @NotEmpty(message = NOT_EMPTY_MSG)
    @NotBlank(message = NOT_BLANK_MSG)
    @NotNull(message = NOT_NULL_MSG)
    @Pattern(regexp = "\\d{11}",message = CPF_REGEX_MSG)
    private String cpf;

    @NotEmpty(message = NOT_EMPTY_MSG)
    @NotBlank(message = NOT_BLANK_MSG)
    @NotNull(message = NOT_NULL_MSG)
    private LocalDate bornDate;

    public PersonalDataValidation() {

    }

    public PersonalDataValidation(Long id, String name, String email, String cpf, LocalDate bornDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.bornDate = bornDate;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }
}







