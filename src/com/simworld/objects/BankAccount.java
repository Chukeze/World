package com.simworld.objects;

import java.math.BigDecimal;
import java.util.Scanner;

public class BankAccount {
    public static void banking(){
        Scanner moneyScanner = new Scanner(System.in);
        double bank_balance = 0;// more precise for banking money calculation
        BigDecimal avaiable_balance;
        for (int transaction = 0; transaction < 1000; transaction++){
            double transaction_amount = moneyScanner.nextDouble();
            double remainder_after_transaction =  bank_balance - transaction_amount;
            System.out.println(remainder_after_transaction);
        }
        System.out.println(bank_balance);
    }

}
