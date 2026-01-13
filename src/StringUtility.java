import java.util.Scanner;

/**
 * Utility class for common String operations.
 */
public class StringUtility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Reversed String: " + reverse(input));
        System.out.println("Is Palindrome: " + isPalindrome(input));
        countVowelsAndConsonants(input);

        scanner.close();
    }

    // Reverse a string
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Check if a string is palindrome
    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(reverse(str));
    }

    // Count vowels and consonants
    public static void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;

        for (char ch : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
