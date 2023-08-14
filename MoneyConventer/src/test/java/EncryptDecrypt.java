import java.util.Scanner;

public class EncryptDecrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        System.out.print("Choose an operation (1: Encrypt, 2: Decrypt): ");
        int operation = scanner.nextInt();

        System.out.print("Enter a number between 1 and 20: ");
        int shift = scanner.nextInt();

        if (operation == 1) {
            String encryptedWord = encrypt(word, shift);
            System.out.println("Encrypted: " + encryptedWord);
        } else if (operation == 2) {
            String decryptedWord = decrypt(word, shift);
            System.out.println("Decrypted: " + decryptedWord);
        } else {
            System.out.println("Invalid operation choice.");
        }
    }

    public static String encrypt(String word, int shift) {
        StringBuilder encrypted = new StringBuilder();

        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                int base = Character.isLowerCase(c) ? 'a' : 'A';
                int shifted = (c - base + shift) % 26 + base;
                encrypted.append((char) shifted);
            } else {
                encrypted.append(c);
            }
        }

        return encrypted.toString();
    }


    public static String decrypt(String word, int shift) {
        StringBuilder decrypted = new StringBuilder();

        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                int base = Character.isLowerCase(c) ? 'a' : 'A';
                int shifted = (c - base - shift + 26) % 26 + base;
                decrypted.append((char) shifted);
            } else {
                decrypted.append(c);
            }
        }

        return decrypted.toString();
    }
}
