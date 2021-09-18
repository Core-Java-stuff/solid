package com.javatechie.solid.dependency.inversion;

public interface BankCard {

    public void doTransaction(int amount);

    // in same example add cashBack method to explain interface segregation principle
    // cashBack method always not applicable for both (credit card and debit card)
    //hence we shouldn't force client to override this method

}
