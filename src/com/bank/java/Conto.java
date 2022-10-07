package com.bank.java;

import java.security.SecureRandom;
import java.util.Random;

public class Conto {
    private final int countID;
    Random r = new Random();
    private String accountholder;
    private float balance = 0;
    public Conto (String accountholder){
        this.countID = r.nextInt(999)+1;
        this.accountholder = accountholder;
    }

    public int getCountID() {
        return countID;
    }
    public float getBalance() {
        return balance;
    }
    public String getAccountholder() {
        return accountholder;
    }

    public void setAccountholder(String accountholder) {
        this.accountholder = accountholder;
    }

    public boolean withdrawal(float ammount){
        if(this.balance - ammount >= 0){
            this.balance -= ammount;
            return true;
        }else{
            return false;
        }
    }
    public void deposit(float ammount){
        this.balance += ammount;
    }

    @Override
    public String toString() {
        return String.format("%.2f€", balance);
    }
}
