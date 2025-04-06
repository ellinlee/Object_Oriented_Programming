package lab9;

import java.util.Scanner;

public class Quiz {
    static int[] first = new int[10];
    static int[] second = new int[10];
    static int[] third = new int[10];
    static int i;

    public static void createQuiz() {
        for(i=0; i<10; i++) {
            first[i] = (int)(Math.random() * 100);
            second[i] = (int)(Math.random() * 100);
        }
    }

    public static void administerQuiz() {
        Scanner sc = new Scanner(System.in);
        for(i=0; i<10; i++) {
            int num = i+1;
            System.out.print("Question " + num + ": What is " + first[i] + " - " + second[i] + "?");
            third[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void gradeQuiz() {
        for(i=0; i<10; i++) {
            int num = i+1;
            System.out.print("Question " + num + ": What is " + first[i] + " - " + second[i] + " = ");
            System.out.print(third[i]);
            if(first[i] - second[i] == third[i])
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

