package com.spring.demo.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StandardError  {

    private Integer status;
    private LocalDateTime timeStamp;
    private String msg;
}
