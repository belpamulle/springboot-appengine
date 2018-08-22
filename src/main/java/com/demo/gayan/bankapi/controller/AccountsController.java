package com.demo.gayan.bankapi.controller;

import com.demo.gayan.bankapi.model.Balance;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
public class AccountsController {

    @ResponseBody
    @RequestMapping("/account/balance")
    public Balance demo(@RequestHeader(value="Authorization", required=false) String authorization) {
        Balance balance = new Balance();
        balance.setAccountId("1234567");
        balance.setAmount("9999.31AUD");
        balance.setCreditDebitIndicator("Credit");
        balance.setType("ClosingAvailable");
        balance.setAsAtTime(Calendar.getInstance().getTime().toString());
        return balance;
    }
}
