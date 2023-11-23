package loops;

import java.util.Scanner;

public class FactorialUsingWhileLoop {

    public static void main(String[] args) {

        System.out.println("Enter the number to find the factorial:");
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int result = 1;
        System.out.print("Factorial of the number "+inputNum+" is : ");
        while(inputNum!= 0)
        {
            result = inputNum * result;
            inputNum--;
        }

        System.out.println(result);
    }
}
