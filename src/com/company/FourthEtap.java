package com.company;

import java.util.Random;
import java.util.Scanner;

public class FourthEtap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberOfRnd = random.nextInt(11) + 2;
        int ResultUser = 0;
        int ResultComp = 0;
        int Difference = 0;
        int Difference1 = 0;

        System.out.println("       **** Start game **** ");
        String [] Arrays = new String[3];
        int sum = 0;
        int sum1 = 0;
        int i = 0;
        while (i < 3) {
            System.out.println("                               ");
            System.out.print("Predict amount of points(2..12): ");
            int Predicted = scanner.nextInt();

            int DiceUser = 0;
            int DiceComp = 0;

            if (Predicted > 1 && Predicted < 13) {

//                             колдонуучу кубикти ыргытат

                System.out.println("User rolls the dices...");
                int a = rollTheDice();
                int b = rollTheDice();
                printDice(a);
                printDice(b);
                DiceUser = a + b;

//                                          кубик ... очко тушту

                System.out.println("On the dice fell " + DiceUser + " points");
                ResultUser = Calculate(DiceUser, Predicted);

                System.out.println("                            ");

                System.out.println("Computer predicted " + numberOfRnd + " points");
                System.out.println("Computer rolls the dice....");
                int c = rollTheDice();
                int d = rollTheDice();
                printDice(c);
                printDice(d);
                DiceComp = c + d;
                System.out.println("on the dice fell " + DiceComp + " points");
                ResultComp = Calculate1(DiceComp, numberOfRnd);
                getSum(ResultUser, ResultComp);
                System.out.println("                                 ");
                System.out.println("*********CURRENT SCORE**********");
                System.out.println("User: " + ResultUser + " points");
                System.out.println("Computer: " + ResultComp + " points");
                getSum(ResultUser, ResultComp);
            } else {
                System.out.println("Wrong!");
            }
            Arrays[i] = "|    |Predicted: " + Predicted + "       |Predicted:" + numberOfRnd + "\n" +
                    "|  -" + (i+1) + "|Dice:" + DiceUser + "            |Dice:" + DiceComp + "\n" +
                    "|    |Result: " + ResultUser + "         |Result: " + ResultComp;

            sum = sum + ResultUser;
            sum1 = sum1 + ResultComp;
            i++;
        }
        System.out.println("                                   ");
        System.out.println("*********** Finish Game ************");
        System.out.println("Round |  User          |  Computer    ");
        for (int a = 0; a < 3; a++) {

            System.out.println("+----+----------------+--------------------+");
            System.out.println(Arrays[a]);
        }
        System.out.println("-----+-----------------+--------------------+");
        System.out.println("Total  | Points:     " + sum+"|  Points:     "+sum1);
        if(sum > sum1){
            Difference = sum - sum1;
            System.out.println("User wins  " + Math.abs(Difference)+" points more. Congratulations");
        } else if(sum < sum1){
            Difference1 = sum1 - sum;
            System.out.println("Computer wins  " + Math.abs(Difference1)+" points more. Congratulations");
        }else if(sum == sum1){
            System.out.println(" Players have a draw ");

        }
    }

    public static int rollTheDice () {
        Random rnd = new Random();
        int a = rnd.nextInt(6) + 1;
        return a;
    }

    //                       кубиктин тушушу

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
        int sum = 0;
        int sum1 = 0;
        if(a < b){
            sum = b - a;
            System.out.println("User wins  " + Math.abs(sum)+" points more. Congratulations");
        }else if(a > b){
            sum1 = a - b;
            System.out.println("Computer wins  " + Math.abs(sum1)+" points more. Congratulations");
        }else if(a == b){
            System.out.println(" Players have a draw ");
        }
    }
     }

