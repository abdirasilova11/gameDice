package com.company;

import java.util.Random;
import java.util.Scanner;

public class ThirdEtap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("**** Start game ****");
        int [] Arrays = new int[3];

        for(int i=0;i<3;i++) {
            Arrays[i] = i;
            System.out.print("Predict amount of points(2..12): ");
            int Zadumka = scanner.nextInt();
            if (Zadumka > 1 && Zadumka < 13) {

//                           колдонуучу кубикти ыргытат

                System.out.println("User rolls the dices...");
                int a = rollTheDice();
                int b = rollTheDice();
                printDice(a);
                printDice(b);
                int resultOfCalc = a + b;

//                                  кубиктен ... очко тушту

                System.out.println("On the dice fell " + resultOfCalc + " points");
                int Number = Calculate(resultOfCalc, Zadumka);
                System.out.println("                           ");
                System.out.println("Ход 2-го игрока(компьютер): ");
                int numberOfRnd = random.nextInt(11) + 2;

                System.out.println("Computer predicted " + numberOfRnd + " points");
                System.out.println("Computer rolls the dice....");
                int c = rollTheDice();
                int d = rollTheDice();
                printDice(c);
                printDice(d);
                int resultOfCalc1 = c + d;
                System.out.println("on the dice fell " + resultOfCalc1 + " points");
                int Number1 = Calculate1(resultOfCalc1, numberOfRnd);
                getSum(Number, Number1);
                System.out.println("*********CURRENT SCORE**********");
                System.out.println("User: " + Number + " points");
                System.out.println("Computer: " + Number1 + " points");
                getSum(Number, Number1);
            } else {
                System.out.println("Wrong!");
            }

        }
    }

    //                        кубикти ыргытуу

    public static int rollTheDice () {
        Random rnd = new Random();
        int a = rnd.nextInt(6) + 1;
        return a;
    }

    //                    кубиктин тушушу

    public static void printDice ( int a){
        System.out.println("+-----+ ");
        switch (a) {
            case (1):
                System.out.println("|     |");
                System.out.println("|  #  |");
                System.out.println("|     |");
                break;
            case (2):
                System.out.println("|     |");
                System.out.println("|   # |");
                System.out.println("|  #  |");
                break;
            case (3):
                System.out.println("|   # |");
                System.out.println("|  #  |");
                System.out.println("| #   |");
                break;
            case (4):
                System.out.println("| # # |");
                System.out.println("|     |");
                System.out.println("| # # |");
                break;
            case (5):
                System.out.println("| #  #|");
                System.out.println("|  #  |");
                System.out.println("| #  #|");
                break;
            case (6):
                System.out.println("| #  #|");
                System.out.println("| #  #|");
                System.out.println("| #  #|");
                break;
            default:
                break;
        }
        System.out.println("+-----+");
    }

    public static int Calculate ( int a, int b){
        int result= a - Math.abs(a - b) * 2;
        System.out.println("Result is " +result+" points");

        return result;
    }
    //        бутту***********************

    public static int Calculate1( int a, int b) {
        int result1 = a - Math.abs(a - b) * 2;
        System.out.println("Result is " +result1 + " points");

        return result1;
    }
    public static void getSum(int a,int b){
        int sum=0;int sum1=0;
        if(a<b){
            sum=b-a;
            System.out.println(" компьютер  "+Math.abs(sum)+" очкого женди");
        }else if(a>b){
            sum1=a-b;
            System.out.println("колдонуучу  "+Math.abs(sum1)+" очкого женди");
        }else if(a==b){

            System.out.println("Оюнчуларда счет ничья ");

        }
    }

}

