package com.company.demo7;


import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {

    private String fullName;
    private String username;
    private String password;
    private String email;
    private String city;
    private String gender;
    private double balance;
    private ArrayList<String> transactionHistory;
    private String pin;

    public User(String username, String password, double balance, String pin, String fullName, String email, String city, String gender) {
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.pin = pin;
        this.fullName = fullName;
        this.email = email;
        this.gender = gender;
        this.city = city;
        this.transactionHistory = new ArrayList<>();
    }
    public User(String username, double initialBalance){
        this.username = username;
        this.balance = initialBalance;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<String> getTransactionHistory() {
        return transactionHistory;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }
}
