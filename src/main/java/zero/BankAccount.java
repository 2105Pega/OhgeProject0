package zero;

import java.util.ArrayList;

public class BankAccount {
    //will keep track of the account ID to issue to new accounts
    public static int accountIdCounter = 100000;

    //variable to represent whether an account is open and Approved or not
    private boolean isApproved;

    //The monetary balance of the account
    private double balance;

    //The account holders' names
    private ArrayList<Customer> holderList = new ArrayList<Customer>();

    //account ID set when account is created
    private int accountId;

    private String username;
    private String password;


    public BankAccount(Customer accountHolder) {
        balance = 0;
        holderList.add(accountHolder);
        isApproved = false;
        accountId = ++accountIdCounter;

    }

    public int getAccountId() {
        return accountId;
    }

    public static void setAccountIdCounter(int accountIdCounter) {
        BankAccount.accountIdCounter = accountIdCounter;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean approved) {
        isApproved = approved;
    }


    //BALANCE
    public double getBalance() {
        return balance;
    }

//    //maybe not needed
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public void addToBalance(double amount) {
        balance += amount;
    }

    public int subtractFromBalance(double amount) {

        //check if there's enough money in the account to withdraw
        if (balance - amount < 0) {
            //if not return -1 and don't subtract from the account
            return -1;
        } else {
            balance -= amount;
            return 1;
        }

    }

    public ArrayList<Customer> getHolderList() {
        return holderList;
    }

    public int addAccountHolder(Customer accountHolder) {
        //check if Customer is already on account
        if (holderList.contains(accountHolder)) {
            //return -1 and maybe do something with that later
            return -1;
        } else {
            holderList.add(accountHolder);
        }
        return 1;
    }

    public int removeAccountHolder(Customer accountHolder) {
        if (holderList.remove(accountHolder)) {
            //remove was successful
            return 1;
        } else {
            //remove was unsuccessful (this Customer was not on the holderList)
            return -1;
        }
    }


}
