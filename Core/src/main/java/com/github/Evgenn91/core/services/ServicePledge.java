package com.github.Evgenn91.core.services;

import com.github.Evgenn91.common.dto.PledgeFullInformation;
import com.github.Evgenn91.common.dto.PledgeFullInformations;
import com.github.Evgenn91.common.dto.SmsCode;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

@Service
public class ServicePledge {

    //генерирование кода и отправка его: обратно и на телефон(sms-кой)
    public SmsCode checkingContractNumber(String contractNumber){
        if(contractNumber.equals("1111111111")){
            System.out.println("yout code: 1111");
            return new SmsCode("1111",contractNumber,"1111HH");
        }
        if(contractNumber.equals("2222222222")) {
            System.out.println("yout code: 2222");
            return new SmsCode("2222",contractNumber,"2222HH");
        }
        if(contractNumber.equals("1234567890")) {
            System.out.println("yout code: 1234");
            return new SmsCode("1234",contractNumber,"1234HH");
        }
        return new SmsCode();
    }


    public PledgeFullInformations getPledges(String contractNumber) {
        PledgeFullInformations pledgesResult = new PledgeFullInformations();
        if(contractNumber.equals("1111111111")){
            pledgesResult.add(generatePledge(contractNumber));
            pledgesResult.add(generatePledge(contractNumber));
            pledgesResult.add(generatePledge(contractNumber));
            pledgesResult.add(generatePledge(contractNumber));
            pledgesResult.add(generatePledge(contractNumber));
        }
        if(contractNumber.equals("2222222222")){
            pledgesResult.add(generatePledge(contractNumber));
            pledgesResult.add(generatePledge(contractNumber));
            pledgesResult.add(generatePledge(contractNumber));
        }
        if(contractNumber.equals("1234567890")){
            pledgesResult.add(generatePledge(contractNumber));
            pledgesResult.add(generatePledge(contractNumber));
            pledgesResult.add(generatePledge(contractNumber));
            pledgesResult.add(generatePledge(contractNumber));
            pledgesResult.add(generatePledge(contractNumber));
            pledgesResult.add(generatePledge(contractNumber));
            pledgesResult.add(generatePledge(contractNumber));
            pledgesResult.add(generatePledge(contractNumber));
            pledgesResult.add(generatePledge(contractNumber));
            pledgesResult.add(generatePledge(contractNumber));
            pledgesResult.add(generatePledge(contractNumber));
            pledgesResult.add(generatePledge(contractNumber));
            pledgesResult.add(generatePledge(contractNumber));
            pledgesResult.add(generatePledge(contractNumber));
            pledgesResult.add(generatePledge(contractNumber));
            pledgesResult.add(generatePledge(contractNumber));
        }
        return pledgesResult;
    }


    private PledgeFullInformation generatePledge(String contractNumber) {
        PledgeFullInformation pledgeResult = new PledgeFullInformation();
        pledgeResult.setRegistration(LocalDate.now());
        LocalDate receiv = LocalDate.of(new Random().nextInt(2023 - 2020) + 2020, new Random().nextInt(12 - 1) + 1, new Random().nextInt(30 - 1) + 1);
        pledgeResult.setReceiving(receiv);
        pledgeResult.setReturning(receiv.plusDays(61));
        pledgeResult.setGrace(receiv.plusDays(91));

        pledgeResult.setGUID(UUID.randomUUID().toString());
        pledgeResult.setNumber(contractNumber);
        Integer pledge = new Random().nextInt(10000 - 1000) + 1000;
        pledgeResult.setPledge(pledge+"");
        pledgeResult.setPercent("0,20");
        pledgeResult.setRemains((new Random().nextInt(pledge - 10) + 10)+"");
        Integer perInDay = pledge/500;
        pledgeResult.setPayment(((LocalDate.now().toEpochDay() - receiv.toEpochDay())*perInDay)+"");
        pledgeResult.setBet(perInDay+"");
        pledgeResult.setNamePerson("Pupok Pypikov Pypikovich");
        pledgeResult.setPhoneNumber(contractNumber);
        return pledgeResult;
    }
}
