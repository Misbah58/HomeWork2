package Homework;


import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        String creditCard= input.nextLine();

        System.out.println("what is the balance on the card ? ");
        int balance= input. nextInt();

    if(balance>1000){
        System.out.println("you have to pay off immediately");

    }else{
        System.out.println("you can spend more");

        }



    }
}
