package HomePracticals.Lsn_17;


import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaQuiz {

    Structure structure = new Structure();

    String[] questions = structure.getQuestion();
    String[] choices = structure.getChoices();
    int questionNo;
    int score = 0;

    public void userQuestionChoice(){
        Scanner scan = new Scanner(System.in);
        structure.questions();
        structure.choices();
        boolean isValidIndex = false;


        while (!isValidIndex) {
            try {
                System.out.print("Enter question No (0 to 3): ");
                questionNo = scan.nextInt();
                String questionPreference = questions[questionNo];
                System.out.println(questionPreference);
                System.out.print(choices[questionNo]);
                isValidIndex = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("You should choose only from 0 to 3!\n");
            }catch (InputMismatchException e){
                System.out.println("Invalid input format. Only number type is allowed here. Try again!\n");
                scan.nextLine(); // clear the scanner buffer after handling the exception
            }
            Object o = new JavaQuiz();

            // animal
            // dog extends animal

        }
    }



    public static void main(String[] args) {
        JavaQuiz quiz = new JavaQuiz();
        Structure structure = new Structure();
        Scanner scan = new Scanner(System.in);

        structure.correctAnswers();
        int questionLength = quiz.questions.length;

        while (questionLength != 0){
            quiz.userQuestionChoice();

            System.out.print("Choose correct option(a to d): ");

            try {
                char userChoice = scan.next().charAt(0);

                if (userChoice == structure.getCorrectAnswers()[quiz.questionNo]) {
                    quiz.score++;
                    System.out.println("Correct answer. Score: " + quiz.score);
                } else {
                    System.out.println("Wrong answer.");
                }
                questionLength--;
                System.out.println("Total score: " + quiz.score);
            }catch (NumberFormatException e){
                System.out.println("Invalid input."); // this does not work. to be clarified.
            }
        }
    }
}
