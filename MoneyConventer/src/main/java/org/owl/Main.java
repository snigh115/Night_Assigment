package org.owl;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static int digit;
    static String choose;


    public static Scanner sc = new Scanner(System.in);

    static String[] mmNumber = {"", "တစ်", "နှစ်", "သုံး", "လေး", "ငါး", "ခြောက်", "ခုနစ်", "ရှစ်", "ကိုး"};
    static String[] mmcount = {"", "သန်း ", "သိန်း ", "သောင်း ", "ထောင် ", "ရာ ", "ဆယ် ", ""};

    static String[] count ={" ကျပ်"};

    public static void main(String[] args) {

        do {
            try{
                digit = userInput("Enter your Money to convent : ");
                sc.nextLine();
                System.out.println();
            }catch(InputMismatchException e){
                System.out.println("It is not Numbers");
//                sc.nextLine();
                //null pointer exception happened here cause of cntinue;

//                continue;
                break;
            }


            System.out.print("Your Myanmar money is : ");
            checkHowManyNumber();

            System.out.println("Want to continue ( y / n )");
//            sc.nextLine();
            choose = sc.nextLine();
            if (choose.equalsIgnoreCase("n")) {
                break;
            }
        } while (choose.equalsIgnoreCase("y"));

    }

    public static int userInput(String message) {

        System.out.print(message);
        return sc.nextInt();

    }

    public static void checkHowManyNumber() {
        if (digit > 1000000) {
            System.out.println("The number is too large.");
        } else {
            if (digit == 0) {
                System.out.println("သုည"+count[0]);
                System.out.println("Out of Money!");
                System.out.println();
            } else {

                // give maximum number and min number
                int maxnum = 1000000;
                int minnum = 1;

                //while maximum number is greater than equal to 1
                //digit is divided by max number if can not divie digit let max number divide by 10 it will make max number to lose '0' in max number
                // than do it again until max number can divide digit
                // if it can divide
                while (maxnum >= 1) {
                    if (digit >= maxnum) {
                        int i = digit / maxnum;
                        System.out.print(mmNumber[i] + mmcount[minnum]);
                        digit = digit % maxnum;
                    }
                    maxnum /= 10;
                    minnum++;
                }
                System.out.println(count[0]);
                System.out.println();
            }
        }


    }
}