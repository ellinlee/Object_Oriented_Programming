package lab9;

import java.util.Scanner;

public class Quiz2 {
    static subtractionQuestion[] questions = new subtractionQuestion[10];
    static int[] third = new int[10];

    public static void createQuiz() {
        int i;
        for(i=0; i<10; i++) {
            questions[i] = new subtractionQuestion();
        }
    }

    public static void administerQuiz() {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<10; i++) {
            int num = i+1;
            System.out.print("Question " + num + ": " + questions[i].getQuestion());
            third[i] = sc.nextInt();
        }
        sc.close();
    }
    public static void gradeQuiz() {
        for (int i=0; i<10; i++) {
            int num = i+1;
            System.out.print("Question " + num + ": " + questions[i].getQuestion() + " " + questions[i].getCorrectAnswer());
            if ( third[i] == questions[i].getCorrectAnswer() )
                System.out.println(" You are correct.");
            else
                System.out.println(" You are wrong.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Output: ");
        System.out.println("Welcome to the quiz:");
        createQuiz();
        administerQuiz();
        System.out.println("Here are the correct answers: ");
        System.out.println("Welcome to the quiz:");
        gradeQuiz();
    }
}
