package com.github.Evgenn91.common.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

//данный объект буду получать из другого микросервиса
@Getter
@Setter
public class PledgeFullInformation implements Serializable {
    private static final long serialVersionUID = -4827758356358650497L;

    private String guid;
    //номер договора
    private String number;
    //сумма займа
    private String pledge;
    //прочент займа
    private String percent;
    //остаток по займу
    private String remains;
    //оплата по договору в день
    private String payment;
    //ставка в день
    private String bet;

    //данные пользователя
    private String namePerson;
    private String phoneNumber;
    private LocalDate registration;

    //дата приема
    private LocalDate receiving;
    //дата возврата
    private LocalDate returning;
    //льготный срок
    private LocalDate grace;

    public String getGUID() {
        return guid;
    }
    public void setGUID(String guid) {
        this.guid = guid;
    }

    @Override
    public String toString() {
        return "PledgeFullInformation{" +
                "guid='" + guid + '\'' +
                ", number='" + number + '\'' +
                ", pledge='" + pledge + '\'' +
                ", percent='" + percent + '\'' +
                ", remains='" + remains + '\'' +
                ", payment='" + payment + '\'' +
                ", bet='" + bet + '\'' +
                ", namePerson='" + namePerson + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", registration=" + registration +
                ", receiving=" + receiving +
                ", returning=" + returning +
                ", grace=" + grace +
                '}';
    }
}
