package org.night;
import java.util.Scanner;

public class EncraptAndDecrapt {
    static String words;
    static int pick;
    static int algoNum;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Caesar Cipher ");

        words = userinput("Enter your words : ");
        choose();
        algoPick();
        showEncDec();

    }

    public static String userinput(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public static void choose() {
        System.out.println("""
                Please choose
                1:Encrypt
                2:Decrypt""");
        pick = sc.nextInt();

    }

    public static void algoPick() {
        System.out.print("Pick your algo number from  1  to  20 :");
        algoNum = sc.nextInt();

        if (algoNum >= 1 && algoNum <= 20) {
            System.out.println("Your algo number is :" + algoNum);
            sc.nextLine();
        } else {
            System.out.println("""
                    Your number is either too large or too low !
                    Pls pick again .""");
//            return algoPick();
        }

//        return words;
    }

    public static void showEncDec() {
        if (pick == 1) {
            String encrypted = encrypt(words, algoNum);
            System.out.println("You choose 1:Encrypt ");
            System.out.println("Encrypt word : " + encrypted);

        } else if (pick == 2) {
            String decrypted = decrypt(words, algoNum);
            System.out.println("you choose 2:Decrypt ");
            System.out.println("Decrypt word : " + decrypted);
        } else {
            System.out.println("You pick the wrong number.");
//            return choose();
        }


    }

    public static String encrypt(String words, int algoNum) {
        StringBuilder ec = new StringBuilder();
        for (char c : words.toCharArray()) {
            if (Character.isLetter(c)) {
                int base = Character.isLowerCase(c) ? 'a' : 'A';
                int shifted = (c - base + algoNum) % 26 + base;
                ec.append((char) shifted);
            } else {
                ec.append(c);
            }
        }
        return ec.toString();
    }

    public static String decrypt(String word, int algoNum) {
        StringBuilder dc = new StringBuilder();

        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                int base = Character.isLowerCase(c) ? 'a' : 'A';
                int shifted = (c - base - algoNum + 26) % 26 + base;
                dc.append((char) shifted);
            } else {
                dc.append(c);
            }
        }

        return dc.toString();
    }
}
