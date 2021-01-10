package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Alice aliceObject = new Alice();
        String searchTerm = aliceObject.userSearchTerm();
        Boolean finalResult = aliceObject.searchSentence(searchTerm);
        if (finalResult == true) {
            aliceObject.getIndex(searchTerm);
            aliceObject.removeWord(searchTerm);
        }
        System.out.println(finalResult);
    }

    public void removeWord(String searchTerm) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do; once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String sentenceLower = sentence.toLowerCase();
        String searchTermLower = searchTerm.toLowerCase();
        int startingPoint1 = 0;
        int endingPoint1 = sentenceLower.indexOf(searchTermLower);
        int startingPoint2 = sentenceLower.indexOf(searchTermLower) + searchTermLower.length();
        String newSentence = sentence.substring(startingPoint1, endingPoint1) + sentence.substring(startingPoint2);
        System.out.println("The updated quote is: " + newSentence);
    }

    public void getIndex(String searchTerm) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do; once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String sentenceLower = sentence.toLowerCase();
        String searchTermLower = searchTerm.toLowerCase();
        int wordIndex = sentenceLower.indexOf(searchTermLower);
        System.out.println("The index of this word is " + wordIndex + " and the length of the word is " + searchTermLower.length());
    }

    public String userSearchTerm() {
        Scanner input = new Scanner(System.in);
        System.out.println("Search sentence for term: ");
        String searchTerm = input.nextLine();
        input.close();
        return searchTerm;
    }

    public boolean searchSentence(String searchTerm) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do; once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String sentenceLower = sentence.toLowerCase();
        String searchTermLower = searchTerm.toLowerCase();
        Boolean result = sentenceLower.contains(searchTermLower);
        return result;
    }
}
