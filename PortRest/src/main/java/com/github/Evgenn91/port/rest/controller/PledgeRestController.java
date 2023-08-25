package com.github.Evgenn91.port.rest.controller;

import com.github.Evgenn91.common.dto.PledgeFullInformations;
import com.github.Evgenn91.common.dto.SmsCode;
import com.github.Evgenn91.core.services.ServicePledge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RestController
@RequestMapping(value = "/v1/pledge")
public class PledgeRestController {

    @Autowired
    ServicePledge servicePledge;


    @GetMapping(value = "/smscode", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public SmsCode checkContractNumber(@RequestParam("contractNumber") String contractNumber) {
        return servicePledge.checkingContractNumber(contractNumber);
    }

    @GetMapping(value = "/lists", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public PledgeFullInformations lists(@RequestParam("contractNumber") String contractNumber){
        return servicePledge.getPledges(contractNumber);
    }
}
