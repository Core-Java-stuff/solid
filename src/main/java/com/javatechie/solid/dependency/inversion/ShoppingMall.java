package com.javatechie.solid.dependency.inversion;

public class ShoppingMall {


    //#Solution 1
    //wrong approach tightly coupled
//    private DebitCard debitCard;
//
//    public ShoppingMall(DebitCard debitCard) {
//        this.debitCard = debitCard;
//    }

    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPayment(Object order, int amount){
        bankCard.doTransaction(amount);
    }


    public static void main(String[] args) {
        DebitCard debitCard=new DebitCard();
        ShoppingMall shoppingMall=new ShoppingMall(debitCard);
        //now there is some error in your debit card and user want to go with Credit card
        //then this won't be possible because ShoppingMall is tightly couple with Debit Card

        //#solution 1
        //Again remove Debit card from constructor and inject CreditCard
        //so we need to design our application so that my shopping mall payment system should
        //accept any type of ATM Card (it shouldn't care whether it is debit or credit card)
        shoppingMall.doPayment("some order", 5000);

        //Perfect solution
        BankCard bankCard=new CreditCard();
        ShoppingMall shoppingMall1=new ShoppingMall(bankCard);
        shoppingMall1.doPayment("do some order", 10000);
    }
}
