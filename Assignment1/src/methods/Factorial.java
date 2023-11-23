package methods;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number to find the factorial:");
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();

        System.out.println("Factorial of the number "+inputNum +" is "+findFactorial(inputNum));
    }

    public static int findFactorial(int inputNum)
    {
        int result = 1;
        while(inputNum!= 0)
        {
            result = inputNum * result;
            inputNum--;
        }
        return result;
    }
}
