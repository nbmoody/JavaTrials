package TryThings;// Created by natha on 10/1/2017.

// Author: Nathaniel Ben. Moody
// Initial Date: 10/1/2017
// Filename: TryPrimatives.java
// Project: JavaTrials


// Imports:


import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.Scanner;

public class TryPrimatives implements TryInterface {

// Attributes:
    byte num1 = 127;
    short num2 = 32767;
    int num3 = 2147483647;
    Integer classNum1 = 2;
    long num4 = 9223372036854775807L;
    float num5 = 1.40239846F;
    Float classNum2 = 1.40F;
    double num6 = 4.9406564584124654;
    Double classNum3 = 4.94;
    String name = "Ben";


// Methods:

    public int timesNum3(int userNum){
        return userNum * this.num3;
    }

    public void trySwitch(int userNum){
        switch(userNum){
            case(1):
                System.out.println("The number was 1!");
                break;
            case(2):
                System.out.println("The number was 2!");
                break;
            case(3):
                System.out.println("The number was 3!");
                break;
            default:
                System.out.println("That number isn't 1, 2, or 3.");
                break;
        }
    }

    @Override
    public void takeAndPrint()throws ValueException{
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("What is your name?\n");
            this.name = scan.nextLine();
            System.out.println("\nYour name is... " + this.name);
        } catch(ValueException ex){
            System.out.println("Your input was not of the right format, sorry.");
            ex.printStackTrace();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private String addToName(String stuffToAdd){
        return this.name.concat(stuffToAdd);
    }




}//end of head class
