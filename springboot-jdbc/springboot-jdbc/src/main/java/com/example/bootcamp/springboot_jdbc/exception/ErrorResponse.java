package com.example.bootcamp.springboot_jdbc.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
    private int statusCode;
    private String message;

    public ErrorResponse(Integer statusCode ,String message)
    {
        super();
        this.message = message;
        this.statusCode = statusCode;
    }
}
