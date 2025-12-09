package com.skillnext2;

import java.util.Scanner;

public class App {

    // Check palindrome for Strings
    public static boolean isStringPalindrome(String str) {
        if (str == null) return false;

        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Check palindrome for Numbers
    public static boolean isNumberPalindrome(int number) {
        int original = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        return original == reverse;
    }

    // Recursive palindrome check
    public static boolean isPalindromeRecursive(String str, int left, int right) {
        if (left >= right) return true;

        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        return isPalindromeRecursive(str, left + 1, right - 1);
    }

    // Reverse a String
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }

    // Menu for options
    public static void showMenu() {
        System.out.println("\n===============================");
        System.out.println("      PALINDROME CHECK MENU     ");
        System.out.println("===============================");
        System.out.println("1. Check String Palindrome");
        System.out.println("2. Check Number Palindrome");
        System.out.println("3. Check Sentence Palindrome");
        System.out.println("4. Recursive Palindrome Check");
        System.out.println("5. Reverse a String");
        System.out.println("6. Exit");
        System.out.println("================================");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            showMenu();
            choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter a string: ");
                    String str = sc.nextLine();
                    if (isStringPalindrome(str)) {
                        System.out.println("\"" + str + "\" is a Palindrome!");
                    } else {
                        System.out.println("\"" + str + "\" is NOT a Palindrome!");
                    }
                    break;

                case 2:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    if (isNumberPalindrome(num)) {
                        System.out.println(num + " is a Palindrome Number!");
                    } else {
                        System.out.println(num + " is NOT a Palindrome Number!");
                    }
                    break;

                case 3:
                    System.out.print("Enter a sentence: ");
                    String sentence = sc.nextLine();
                    if (isStringPalindrome(sentence)) {
                        System.out.println("Sentence is a Palindrome!");
                    } else {
                        System.out.println("Sentence is NOT a Palindrome!");
                    }
                    break;

                case 4:
                    System.out.print("Enter string for recursive check: ");
                    String rec = sc.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

                    if (isPalindromeRecursive(rec, 0, rec.length() - 1)) {
                        System.out.println("Recursive Result: Palindrome!");
                    } else {
                        System.out.println("Recursive Result: Not a Palindrome!");
                    }
                    break;

                case 5:
                    System.out.print("Enter a string to reverse: ");
                    String rev = sc.nextLine();
                    System.out.println("Reversed String: " + reverseString(rev));
                    break;

                case 6:
                    System.out.println("Exiting Program... Thank You!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
