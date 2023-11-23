package ifelsestatementprograms;

import java.util.Scanner;

public class VoteEligibilityChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int userAge = scanner.nextInt();
        if (userAge < 18)
        {
            System.out.println("User is not eligible for voting!!!");
        }
        else {
            System.out.println("User is eligible for voting!!!!");
        }

    }
}
