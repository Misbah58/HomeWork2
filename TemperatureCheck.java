package Homework;

import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {
        int temperature= 40;
        if(temperature<32) {
            System.out.println("Water will freeze with temperature");
        }else{
            System.out.println("Water will not freeze with temperature");
        }
    }

    public static class Temperature {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter your city");
            String City = input.nextLine();


            System.out.println("enter the temperature in yor city");
            int tempF= input. nextInt();
            double tempC=(tempF-32)*0.5556;
            System.out.println("The temperature is "+tempC+" the city is " +City);

        }
    }
}
