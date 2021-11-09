import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        String question = "What is the second leter in the greek alphabet";
        String choiceOne = "Alpha";
        String choiceTwo = "Beta";
        String choiceThree = "Gamma";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println("Your answer choices are: " + choiceOne + ", " + choiceTwo + ", or " + choiceThree);
        // Have the user input an answer
        Scanner input = new Scanner(System.in);
        // Retrieve the user's input
        String answer = input.nextLine();
        input.close();
        // If the user's input matches the correctAnswer...
        if(answer.equals(correctAnswer)){
            System.out.println("Congratulations, you got the right answer!");
        } else {
            System.out.println("Sorry, that's not right, the correct answer is " + correctAnswer);
        }
        // then the user is correct and we want to print out a congrats message to the user.

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }

}
