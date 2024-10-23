package com.eazybytes.app;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("CivIc"));
        System.out.println(isPalindrome("Radar"));
        System.out.println(isPalindrome("World"));
    }

    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();

        char[] copyWord = word.toLowerCase().toCharArray();

        String reverseWord = "";

        for (int i = (word.length() - 1); i >= 0; i--) {
            reverseWord += copyWord[i];
        }

        if (word.equals(reverseWord)) {
            return true;
        } else {
            return false;
        }
    }
}
