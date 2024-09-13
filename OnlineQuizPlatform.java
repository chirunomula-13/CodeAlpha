

import java.util.*;

public class OnlineQuizPlatform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define questions, options, and answers
        String[][] questions = {
                {"What is the capital of India?", "A) Mumbai", "B) Delhi", "C) Chennai", "D) Kolkata", "B"},
                {"Which planet is known as the Red Planet?", "A) Earth", "B) Mars", "C) Jupiter", "D) Saturn", "B"},
                {"Who painted the Mona Lisa?", "A) Leonardo da Vinci", "B) Vincent van Gogh", "C) Pablo Picasso", "D) Claude Monet", "A"}
        };

        int score = 0;

        // Iterate over questions
        for (String[] question : questions) {
            System.out.println(question[0]);
            for (int i = 1; i < 5; i++) {
                System.out.println(question[i]);
            }
            System.out.print("Enter your answer (A/B/C/D): ");
            String answer = scanner.next();
            if (answer.equals(question[5])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
        }

        System.out.println("Your final score is: " + score + "/" + questions.length);
    }
}
