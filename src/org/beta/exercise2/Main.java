package org.beta.exercise2;

public class Main {
    public static void main(String[] args) {
        ING user = new ING(1000 , 200);
        System.out.println("Balance in ING account: " + user.accountBalance());
    }
}