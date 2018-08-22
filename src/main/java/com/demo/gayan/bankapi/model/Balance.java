package com.demo.gayan.bankapi.model;

public class Balance {

    private String type;   // "ClosingAvailable", "AccountBalance"
    private String accountId;
    private String amount;
    private String CreditDebitIndicator; // "Credit", "Debit"
    private String asAtTime;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCreditDebitIndicator() {
        return CreditDebitIndicator;
    }

    public void setCreditDebitIndicator(String creditDebitIndicator) {
        CreditDebitIndicator = creditDebitIndicator;
    }

    public String getAsAtTime() {
        return asAtTime;
    }

    public void setAsAtTime(String asAtTime) {
        this.asAtTime = asAtTime;
    }
}
