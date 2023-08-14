public class gpt {
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
