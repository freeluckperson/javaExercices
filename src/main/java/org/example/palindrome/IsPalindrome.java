package org.example.palindrome;

import java.util.Scanner;

public class IsPalindrome {
    private void Invertir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String invert = "";

        for (int i = 0; i < str.length(); i++) {
            invert = str.charAt(i) + invert;
        }
        if (invert.equals(str)) {
            System.out.println("Is palindrome");
        } else {
            System.out.println("Is NOT palindrome");
        }
    }

    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        isPalindrome.Invertir();
    }
}
