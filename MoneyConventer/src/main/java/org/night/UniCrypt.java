package org.night;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UniCrypt {
    static String words;
    static int pick;
    static int algonum;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        words = userinput("Enter your words : ");
        pick = choose("""
                Please choose
                1:Encrypt
                2:Decrypt
                """);

        algonum = choose("Enter a number between 1 and 20:");

    }

    public static String userinput(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public static int choose(String message) {
        System.out.println(message);
        pick= sc.nextInt();

        if (pick == 1) {
            System.out.print("1: Encrypt");
        } else if (pick == 2) {
            System.out.println("2: Decrypt");
        } else {
            System.out.println("Your number is wrong!\n Pick again");
        }
        return 0;
    }

    public static void ecnDecCheck() {
        if (pick == 1) {
            System.out.print("1: Encrypt");
        } else if (pick == 2) {
            System.out.println("2: Decrypt");
        } else {
            System.out.println("Your number is wrong!\n Pick again");
        }
    }

}
