/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleatm;

import java.io.IOException;
import java.util.Scanner;

public class SimpleATM {

    public static void simple(String[] args) throws IOException 
    {
        int checkPin;
        float curBal = 0;
        
        do{
            System.out.println("Enter PIN:");
            Scanner sc = new Scanner(System.in);
            checkPin = sc.nextInt();
        }while(checkPin != 2018 && checkPin != 1995 && checkPin != 5678);
        
        if(checkPin == 2018 || checkPin == 1995 || checkPin == 5678){
            curBal = setBalance(curBal, checkPin);
            System.out.println("\n\n\n\n");
            Menu(curBal);
        }
    }
    public static void Menu (float curBal) throws IOException
    {
        int choice;
        do{
            System.out.println("MENU\n");
            System.out.println("(1) Inquire Balance\n");
            System.out.println("(2) Withdraw\n");
            System.out.println("(3) Deposit\n");
            System.out.println("(4) Log out\n\n");
            System.out.println("Enter your choice:");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                        inqBalance(curBal);
                    break;
                case 2:
                        if(curBal != 0){
                            curBal = withdraw(curBal);
                        }else{
                            System.out.println("Your balance is P0.0! "
                                    + "You cannot withdraw money\n\n");
                        }
                    break;
                case 3:
                        curBal = deposit(curBal);
                    break;

            }
        }while(choice != 4);
        if(choice == 4){
            System.out.println("\n\nYou have logged out from your account.\n");
        }
    }
    public static float setBalance (float curBal, int checkPin)
    {
        if(checkPin == 2018){
            curBal = (float) 53300;
        }else if(checkPin == 1995){
            curBal = (float) 15000;
        }else if(checkPin == 5678){
            curBal = (float) 111570.78;
        }
        return curBal;
    }
    public static void inqBalance (float curBal)
    {
        System.out.println("Your current balance is: P" + curBal + "\n\n\n\n");
    }
    public static float withdraw (float curBal)
    {
        System.out.println("Your current balance is: P" + curBal + "\n\n\n\n");
        float money;
        int ctr = 0;
        do{
            System.out.println("Please enter the amount you'd like to withdraw:\n");
            Scanner sc = new Scanner(System.in);
            money = sc.nextFloat();
            ctr = 0;
            
        }while(money > curBal);
        
        if(money < curBal){
            curBal = curBal - money;
            System.out.println("The amount you withdraw was P" + money + "\n");
            System.out.println("Your current balance left is: P" + curBal + "\n\n\n");
        }
        return curBal;
    }
    public static float deposit (float curBal)
    {
        float money;
        System.out.println("Your current balance is: P" + curBal + "\n\n");
        System.out.println("Please enter the amount you'd like to deposit:\n");
        Scanner sc = new Scanner(System.in);
        money = sc.nextFloat();
        
        curBal += money;
        
        System.out.println("The amount you deposited was P" + money + "\n");
        System.out.println("Your current balance is: P" + curBal + "\n\n\n");
        
        return curBal;
    }
    
}
