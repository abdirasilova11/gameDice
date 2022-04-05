package com.company;

import java.util.Random;
import java.util.Scanner;

public class SecondEtap {

    public static void main(String[] args) {

        System.out.println("**** Start game ****");
        System.out.print("Predict amount of points(2..12): ");
        Scanner scanner = new Scanner(System.in);
        int Zadumka = scanner.nextInt();
        if (Zadumka > 1 && Zadumka < 13) {
//                            колдонуучу кубик ыргытат

            System.out.println("User rolls the dices...");
            int a = rollTheDice();
            int b = rollTheDice();
            printDice(a);
            printDice(b);
            int resultOfCalc = a + b;

//                          кубик ... очко тушту

            System.out.println("On the dice fell " + resultOfCalc + " points");
            int Number=Calculate(resultOfCalc, Zadumka);
            Scanner scanner1 = new Scanner(System.in);
            System.out.println(" 2 - оюнчунун ходу (компьютер): ");
            System.out.print("Predict amount of points(2..12):");
            int ZadumkaComp = scanner1.nextInt();
            System.out.println("Computer predicted " + ZadumkaComp + " points");
            System.out.println("Computer rolls the dice....");
            int c = rollTheDice1();
            int d= rollTheDice1();
            printDice(c);
            printDice(d);
            int resultOfCalc1 = c + d;
            System.out.println("on the dice fell " + resultOfCalc1 + " points");
            int Number1 = Calculate1(resultOfCalc1,ZadumkaComp);
            getSum(Number,Number1);
        } else {
            System.out.println("Wrong!");
        }
    }
    //                   кубикти ыргытуу

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
                System.out.println("| #   #|");
                System.out.println("|   #  |");
                System.out.println("| #   #|");
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
    public static int rollTheDice1 () {
        Random rnd = new Random();
        int a = rnd.nextInt(6) + 1;
        return a;
    }

    //                           кубиктин тушушу

    public static void printDice1 ( int a){
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
    public static int Calculate1( int a, int b) {
        int result1 = a - Math.abs(a - b) * 2;
        System.out.println("Result is " +result1 + " points");

        return result1;
    }

    public static void getSum(int a,int b){
        int sum = 0;
        int sum1 = 0;
        if(a < b){
            sum = b - a;
            System.out.println(" компьютер "+ sum +" очкого женди");
        }else if(a > b){
            sum1 = a - b;
            System.out.println(" колдонуучу "+ sum1 +" очкого женди");
        }else if(a == b){
            System.out.println("Оюнчуларда счет ничья ");
        }
    }

}

