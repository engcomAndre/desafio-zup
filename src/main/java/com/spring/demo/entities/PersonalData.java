package com.spring.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

import static com.spring.demo.constants.ValidationMessages.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class PersonalData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = NOT_EMPTY_MSG)
    @NotBlank(message = NOT_BLANK_MSG)
    @NotNull(message = NOT_NULL_MSG)
    @Size(min = 5, max = 120, message = NAME_SIZE_MSG)
    private String name;

    @Email(message = EMAIL_MSG)
    @NotEmpty(message = NOT_EMPTY_MSG)
    @NotBlank(message = NOT_BLANK_MSG)
    @NotNull(message = NOT_NULL_MSG)
    @Column(unique = true)
    private String email;

    @NotEmpty(message = NOT_EMPTY_MSG)
    @NotBlank(message = NOT_BLANK_MSG)
    @NotNull(message = NOT_NULL_MSG)
    @Pattern(regexp = "\\d{11}", message = CPF_REGEX_MSG)
    @Column(unique = true)
    private String cpf;

    @NotNull(message = NOT_NULL_MSG)
    private LocalDate bornDate;
}







