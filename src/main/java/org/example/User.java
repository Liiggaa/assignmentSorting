package org.example;
import java.util.*;

public class User implements Comparable<User> {

    String name;
    Double balance;

    public static List<User> user = new ArrayList<>();

    Integer paymentRecords = 0;
    Double newBalance;


    public User(String name, Double balance) {
        this.name = name;
        this.balance = balance;
        this.paymentRecords = 0;
        this.newBalance = balance; // balance is the same if user didn't purchase anything
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getNewBalance() {
        return this.newBalance;
    }

    public Integer getPaymentRecords() {
        return paymentRecords;
    }

    public double payment(User user, String paymentFor, double pay) {
        if (this.balance > pay && this.balance > 0) {
            double newBalance = user.getBalance() - pay;
            this.paymentRecords++; // increasing payment record
            this.newBalance = newBalance; // assign new value to field
            this.balance = newBalance; // change object balance field, with every payment
            return newBalance;
        } else {
            System.out.println("You don't have enough money!");
        }
//        return 0;
        System.out.println("Your balance is " + newBalance + "!" + " You cant buy item, which cost " + pay);
        return newBalance;
    }


    @Override
    public boolean equals(Object o) { // collect argument (object)
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;

        return (balance.equals(user.getBalance())) &&       //check if object fields are the same
                (paymentRecords.equals(user.getPaymentRecords())) &&
                (newBalance.equals(user.getNewBalance())) &&
                (name.toLowerCase().equals(user.getName().toLowerCase()));
    }

    @Override
    public int hashCode() {
        int result = 31 * name.toLowerCase().hashCode() +
                balance.hashCode() + paymentRecords.hashCode() + newBalance.hashCode();
        return result;
    }


    @Override
    public int compareTo(User user) {
        int i = 0; //  index to iterate over the characters when comparing
        // iterate over the characters in the names and return the difference between the ASCII values of the first different characters
        if (!this.name.toLowerCase().equals(user.getName().toLowerCase())) { // if name is not the same
            while (i < this.name.length() && i < user.getName().length() && this.name.toLowerCase().charAt(i) == user.getName().toLowerCase().charAt(i)) {
                i++;
            }
            if (i < this.name.length() && i < user.getName().length()) {
                return this.name.toLowerCase().charAt(i) - user.getName().toLowerCase().charAt(i);
            } else {
                return this.name.length() - user.getName().length();
            }
        }

        if (!this.balance.equals(user.getBalance())) { // if name is the same, check balance
            return (int) (this.balance - user.getBalance());
        }

        if (!this.newBalance.equals(user.getNewBalance())) { // if name and balance are the same check new balance
            return (int) (this.newBalance - user.newBalance);
        }

        if (!this.paymentRecords.equals(user.getPaymentRecords())) { // if name, balance, and new balance are the same, check payments
            //return this.paymentRecords - user.paymentRecords;  // ASC
            return user.getPaymentRecords() - this.paymentRecords; // DESC
        }
        return 0;
    }


    @Override
    public String toString() { // all information about the object
        return "{name: " + name + " " + "balance: " + balance + " " + "}";
    }

}


