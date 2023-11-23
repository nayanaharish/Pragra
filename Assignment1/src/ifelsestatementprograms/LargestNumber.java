package ifelsestatementprograms;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int inputNum1 = scanner.nextInt();
        System.out.println("Enter the second number :");
        int inputNum2 = scanner.nextInt();
        System.out.println("Enter the third number :");
        int inputNum3 = scanner.nextInt();

        int largestNumber = 0 ;

        if (inputNum1 > inputNum2)
        {
           if (inputNum1 > inputNum3)
           {
               largestNumber = inputNum1 ;
           }
           else
           {
               largestNumber = inputNum3 ;
           }

        } else  {

            if (inputNum2 > inputNum3)
            {
                largestNumber = inputNum2 ;
            }
            else
            {
                largestNumber = inputNum3;
            }
        }

        System.out.println("Largest number is"+ largestNumber);
    }
}
