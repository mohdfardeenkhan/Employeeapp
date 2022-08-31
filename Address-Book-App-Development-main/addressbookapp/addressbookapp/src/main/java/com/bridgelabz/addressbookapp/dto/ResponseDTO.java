package com.bridgelabz.addressbookapp.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ResponseDTO {
    private String message;
    private Object data;

    public ResponseDTO(String message, Object data) {
        this.message = message;
        this.data = data;
    }
}
