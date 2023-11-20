package SwitchStatement;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Enter the oeration" +
                "1.Add 2.Sub 3. Mul 4.Div");
        Scanner scanner = new Scanner(System.in);
        int op = scanner.nextInt();

        System.out.println("Enter the first operand:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second operand:");

        int num2 = scanner.nextInt();

       double r =  Calculator(num1,num2,op);
        System.out.println("Result is "+r);


    }

    public static double Calculator(int num1,int num2,int operator)
    {
        int result = 0 ;
        switch (operator)
        {
            case 1 :
                result = num1 + num2;
                break;
            case 2 :
                result = num1 - num2;
                break;
            case 3 :
                result = num1 * num2;
                break;
            case 4 :
                result = num1 / num2;
                break;
        }
return result;
    }
}
