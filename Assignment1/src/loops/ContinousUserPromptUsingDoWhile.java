package loops;

import java.util.Scanner;

public class ContinousUserPromptUsingDoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char exit ;

        do {
            System.out.println("Enter your input:");
            String userInput = scanner.next();
            System.out.println("This your input "+userInput);

            System.out.println("Do you want to exit press q ");
            exit = scanner.next().charAt(0);
        }
        while(exit != 'q');
    }
}
