package exercises;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<String, Integer> freshStudents = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newKid;

        System.out.println("Who be you?");

        do {
            System.out.print("Student: ");
            newKid = input.nextLine();

            if (!newKid.equals("")) {
                System.out.print("ID: ");
                Integer idInfo = input.nextInt();
                freshStudents.put(newKid, idInfo);

                input.nextLine();
            }
        } while (!newKid.equals(""));

        System.out.println("\nClass roster");

        for (Map.Entry<String, Integer> student : freshStudents.entrySet()) {
            System.out.println(student.getKey() + " ~ ID: " + student.getValue());
        }
    }
}
