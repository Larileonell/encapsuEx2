package entities.application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number:   ");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Is there na initial deposit (y/n)?");
        char response = sc.next().charAt(0);
        Account account;
        if (response == 'y'){
            System.out.println("Enter initial deposit value:");
            double initalDeposit = sc.nextDouble();
           account = new Account(number, holder, initalDeposit);
        }
        else{
           account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("ACCOUNT DATA");
        System.out.println(account);
        sc.close();
    }
}
