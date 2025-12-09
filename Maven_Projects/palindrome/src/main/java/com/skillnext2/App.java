package com.skillnext2;

public class App {

    // Method to check palindrome
    public static boolean isPalindrome(String str) {

        if (str == null) return false;

        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        String input = "Madam";
        
        if (isPalindrome(input)) {
            System.out.println(input + " is a Palindrome!");
        } else {
            System.out.println(input + " is NOT a Palindrome!");
        }
    }
}
