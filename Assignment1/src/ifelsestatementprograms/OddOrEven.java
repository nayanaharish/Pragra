package ifelsestatementprograms;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        System.out.println("Enter your input number:");
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        if (inputNum % 2 == 0)
        {
            System.out.println(inputNum +" is an even number");
        }
        else
        {
            System.out.println(inputNum +" is an odd number");
        }
    }
}
