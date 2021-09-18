package com.javatechie.solid;

import java.util.Random;
//1
public class BankService {

    public long deposit(long amount) {
        //add amount to current balance
        //return total amount
        return new Random(32623).nextLong() + amount;
    }

    public long withDraw(long amount) {
        return new Random(74364638).nextLong() - amount;
    }

    //This can move To Printer Service
    public void printPassbook(){
        //update transaction info in passbook
    }

    //This can move to loan service
    public void getLoanInterestInfo(String loanType){
        //based on loan type anytime bank can change their interest amount
    }

    //This can move to notification service
    public void sendOTP(String sendTo,String email){
        //otp can send to mobile as message or email to register email id
        //now only email feature is there
        //if tomorrow user want mobile OTP then we may need to do code change here
        //sending otp is not part of bank transaction
    }

}
