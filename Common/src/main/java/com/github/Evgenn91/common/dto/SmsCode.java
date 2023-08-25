package com.github.Evgenn91.common.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class SmsCode implements Serializable {
    private String code;
    private String phoneNumber;
    private String globalGUID;

    public SmsCode() {
    }

    public SmsCode(String code, String phoneNumber, String globalGUID) {
        this.code = code;
        this.phoneNumber = phoneNumber;
        this.globalGUID = globalGUID;
    }

    @Override
    public String toString() {
        return "SmsCode{" +
                "code='" + code + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", globalGUID='" + globalGUID + '\'' +
                '}';
    }
}
