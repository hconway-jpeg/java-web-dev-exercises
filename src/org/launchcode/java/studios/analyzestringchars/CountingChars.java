package org.launchcode.java.studios.analyzestringchars;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CountingChars {
    public static void main(String[] args) {
        HashMap<Character, Integer> characterCount = new HashMap<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence to catalogue: ");
        String testString = input.nextLine();
        input.close();

        char[] charArray = testString.toLowerCase().toCharArray();

        for (Character searchChar : charArray) {
            if (characterCount.containsKey(searchChar)) {
                characterCount.put(searchChar, characterCount.get(searchChar) + 1);
            } else {
                characterCount.put(searchChar, 1);
            }
        }
        for (Map.Entry<Character, Integer> searchChar : characterCount.entrySet()) {
            System.out.println(searchChar.getKey() + " : " + searchChar.getValue());
        }
    }
}
