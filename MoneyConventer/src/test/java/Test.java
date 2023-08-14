import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {


    static String words;
    static int pick;
    static int algonum;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        words = userinput("Enter your words : ");
        choose();
        algoPick();
    }

    public static String userinput(String message) {
        System.out.print(message);
        return sc.next();
    }

    public static void choose() {
        System.out.println("Please choose\n1: Encrypt\n2: Decrypt");

        try {
            pick = sc.nextInt();
            sc.nextLine(); // Consume the newline left in the buffer
            yourChoice();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter 1 or 2.");
            sc.nextLine();
            choose();
        }
    }

    public static void yourChoice() {

        if (pick == 1) {
            System.out.println("You choose 1:Encrypt ");
        } else if (pick == 2) {
            System.out.println("you choose 2:Decrypt ");
        } else {
            System.out.println("You pick the wrong number.");
            sc.nextLine();
            choose();
        }
    }

    public static void algoPick() {
        System.out.print("Pick your algorithm from 1 to 20: ");
        try {
            algonum = sc.nextInt();
            handleAlgorithmPick();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            sc.nextLine();
            algoPick();
        }
    }
    public static void handleAlgorithmPick() {
        if (algonum >= 1 && algonum <= 20) {
            System.out.println("Your number is: " + algonum);
            sc.nextLine();
        } else {
            System.out.println("Your number is either too large or too low. Please pick again.");
            algoPick();
        }
    }


}

