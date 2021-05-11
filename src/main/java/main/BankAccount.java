package main;

import java.util.ArrayList;

public class BankAccount {
    //The monetary balance of the account
    private double balance;

    //The account holders' names
    private ArrayList<Customer> holderList;


    BankAccount(Customer accountHolder) {
        balance = 0;
        holderList.add(accountHolder);
    }

    public double getBalance() {
        return balance;
    }

    //maybe not needed
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addToBalance(double amount) {
        balance+=amount;
    }

    public int subtractFromBalance(double amount){

        //check if there's enough money in the account to withdraw
        if(balance - amount < 0){
            //if not return -1 and don't subtract from the account
            return -1;
        }
        else{
            balance-=amount;
            return 1;
        }

    }

    public int addAccountHolder(Customer accountHolder){
        //check if Customer is already on account
        if(holderList.contains(accountHolder)){
            //return -1 and maybe do something with that later
            return -1;
        }
        else{
            holderList.add(accountHolder);
        }
        return 1;
    }
}
