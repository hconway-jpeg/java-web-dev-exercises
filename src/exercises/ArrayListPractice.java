package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(420, 666, 69, 1, 2, 3, 4, 5, 333, 13));
        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("Dolphin", "Magic", "Syrup", "Candles", "Haiku", "Summertime"));

        ArrayListPractice.findSumEven(numList);
        ArrayListPractice.wordSearch(wordList);
    }

    public static Integer findSumEven(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                sum += numbers.get(i);
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static void wordSearch(ArrayList<String> listOfWords) {
        Scanner input = new Scanner(System.in);
        System.out.println("Search for words of length (in letters): ");
        Integer magicNumber = input.nextInt();
        input.close();

        for (int i = 0; i < listOfWords.size(); i++) {
            if (listOfWords.get(i).length() == magicNumber) {
                System.out.println(listOfWords.get(i));
            }
        }
    }
}
