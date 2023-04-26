package org.example;

//ASSIGNMENT
/*
Sorting objects
Create User and Market class
* Users ==> name, balance, each user can make a purchase, every time user buys something, balance goes down, each new purchase are recorded
* Payment record ==> records per user, each user can make a purchase
* Market ==> main method
* get all users sorted by name
* get all users sorted by balance, the lowest balance to the highest ASC
* get all user sorted by most paying, who bought the most, DESC
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Market {
    public static void main(String[] args) {

// Sort by name if name are not the same

 System.out.println("\n****************** SORT BY NAME ***************");
        List<User> userList = new ArrayList<>();
        User user1 = new User("John", 200.0);
        User user2 = new User("Sam", 400.0);
        User user3 = new User("Alex", 400.0);
        User user4 = new User("Amanda", 400.0);
        User user5 = new User("Johns", 300.0);
        User user6 = new User("James", 400.0);

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);

// Check if objects are equal
//      System.out.println(user1.equals(user6));
//      System.out.println(user4.equals(user5));
//      System.out.println(user1.hashCode() == (user6.hashCode()));
//      System.out.println(user4.hashCode() == (user5.hashCode()));


// If name are the same, sort by balance

// System.out.println("\n****************** SORT BY BALANCE ***************");
//        List<User> userList = new ArrayList<>();
//        User user1 = new User("A", 200.0);
//        User user2 = new User("A", 400.0);
//        User user3 = new User("A", 400.0);
//        User user4 = new User("A", 400.0);
//        User user5 = new User("A", 300.0);
//        User user6 = new User("A", 400.0);
//
//        userList.add(user1);
//        userList.add(user2);
//        userList.add(user3);
//        userList.add(user4);
//        userList.add(user5);
//        userList.add(user6);


// If names are the same and balance is the same, sort by new balance

// System.out.println("\n****************** SORT BY NEW BALANCE ***************");
//        List<User> userList = new ArrayList<>();
//        User user1 = new User("A", 400.0);
//        User user2 = new User("A", 400.0);
//        User user3 = new User("A", 400.0);
//        User user4 = new User("A", 400.0);
//        User user5 = new User("A", 400.0);
//        User user6 = new User("A", 400.0);
//
//        userList.add(user1);
//        userList.add(user2);
//        userList.add(user3);
//        userList.add(user4);
//        userList.add(user5);
//        userList.add(user6);
//
//
//
// System.out.println("*********************** PAYMENTS *********************\n");
//      System.out.println("User: " + user1.getName() + " " + user1.getBalance() + " --> new balance: "+ user1.payment(user1, "bag", 100));
//      System.out.println("User: " + user1.getName() + " " + user1.getBalance() + " --> new balance: "+ user1.payment(user1, "food", 100));
//
//      System.out.println("User: " + user2.getName() + " " + user2.getBalance() + " --> new balance: "+ user2.payment(user2, "phone", 350));
//      System.out.println("User: " + user2.getName() + " " + user2.getBalance() + " --> new balance: "+ user2.payment(user2, "shoes", 45));
//      System.out.println("User: " + user2.getName() + " " + user2.getBalance() + " --> new balance: "+ user2.payment(user2, "ticket", 10));
//
//      System.out.println("User: " + user4.getName() + " " + user4.getBalance() + " --> new balance: "+ user4.payment(user4, "food", 100));
//      System.out.println("User: " + user4.getName() + " " + user4.getBalance() + " --> new balance: "+ user4.payment(user4, "book", 50));
//      System.out.println("User: " + user4.getName() + " " + user4.getBalance() + " --> new balance: "+ user4.payment(user4, "ticket", 10));
//
//      System.out.println("User: " + user1.getName() + " " + user1.getBalance() + " --> new balance: "+ user1.payment(user1, "jacket", 100));
//      System.out.println("User: " + user1.getName() + " " + user1.getBalance() + " --> new balance: "+ user1.payment(user1, "bus tickets", 6));


// If name, balance and new balance is the same, sort by payments

// System.out.println("\n****************** SORT BY PAYMENTS ***************");
//        List<User> userList = new ArrayList<>();
//        User user1 = new User("A", 400.0);
//        User user2 = new User("A", 400.0);
//        User user3 = new User("A", 400.0);
//        User user4 = new User("A", 400.0);
//        User user5 = new User("A", 400.0);
//        User user6 = new User("A", 400.0);
//
//        userList.add(user1);
//        userList.add(user2);
//        userList.add(user3);
//        userList.add(user4);
//        userList.add(user5);
//        userList.add(user6);
//
//        user1.payment(user1, "books", 50);
//        user1.payment(user1, "food", 50);
//        user1.payment(user1, "food", 50);
//        user1.payment(user1, "bus tickets", 50);
//
//        user2.payment(user2, "phone", 200);
//
//        user4.payment(user4, "food", 50);
//        user4.payment(user4, "books", 50);
//        user4.payment(user4, "shoes", 100);
//


        System.out.println("\n-------------------Unsorted list---------------");
        for (User user : userList) {
            System.out.println("User: " +user.getName() + " balance: " +user.getBalance()+ " new balance: "+ user.getNewBalance() + " sales:  " + user.getPaymentRecords());
        }

        System.out.println("\n-------------------Sorted list-----------------");

        Collections.sort(userList);
        for (User user : userList) {
            System.out.println("User: "+user.getName() + " balance: " +user.getBalance()+ " new balance: "+ user.getNewBalance() + " sales:  " + user.getPaymentRecords());
        }
    }
}