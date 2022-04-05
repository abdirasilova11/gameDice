package com.company;

import java.util.Random;
import java.util.Scanner;

public class FirstEtap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ----- Start game ----- ");
        System.out.println("Predicate amount of points (2 ... 12): ");
        int zadumka = sc.nextInt();
        if (zadumka > 1 && zadumka < 13) {

            // колдонуучу кубикти ыргытат

            System.out.println("User rolls the dises... ");
           int a = rollTheDice();
           int b = rollTheDice();
           printDice(a);
            printDice(b);
            int resultOfCalculate = a + b;

        // кубик очко ... тушту

            System.out.println("On the dice fell " + resultOfCalculate + "points ");
        } else {
            System.out.println(" Wrong! ");
        }

    }

    // кубикти ыргытуу
    public static int rollTheDice(){
        Random rnd=new Random();
        int a= rnd.nextInt(6)+1;
        return a;
    }

    // кубиктин тушушу

    public static void printDice(int a){
        System.out.println("+-----+ ");
        switch(a){
            case(1):
                System.out.println("|     |");
                System.out.println("|  #  |");
                System.out.println("|     |");
                break;
            case(2):
                System.out.println("|     |");
                System.out.println("|   # |");
                System.out.println("|  #  |");
                break;
            case(3):
                System.out.println("|   # |");
                System.out.println("|  #  |");
                System.out.println("| #   |");
                break;
            case(4):
                System.out.println("| # # |");
                System.out.println("|     |");
                System.out.println("| # # |");
                break;
            case(5):
                System.out.println("| #  #|");
                System.out.println("|  #  |");
                System.out.println("| #  #|");
                break;
            case(6):
                System.out.println("| #  #|");
                System.out.println("| #  #|");
                System.out.println("| #  #|");
                break;
            default:
                break;}
        System.out.println("+-----+");

    }

           //     очколорду салыштыруу
    public static void compeirTheDice(int a){
        if(a>0){
            System.out.println("User wins");
        }else if(a<0){
            System.out.println("User Losts");
        }else{
            System.out.println("User and Random's dice equal.");
        }

    }

    public static int Calculate(int a,int b){
        int result=a-Math.abs(a-b)*2;
        System.out.println("Result is "+result+" points");
        compeirTheDice(result);
        return result;
    }


}
