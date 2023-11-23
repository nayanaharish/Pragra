package switchstatementprograms;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double operandOne =  scanner.nextInt();
        System.out.println("Enter the second number:");
        double operandTwo =  scanner.nextInt();
        System.out.println("Enter the operator  + , - , * , /");
        char operator = scanner.next().charAt(0);

        double result = 0 ;
        switch (operator)
        {

            case '+' :
                result =  operandOne + operandTwo ;
                break;
            case '-' :
                result =  operandOne - operandTwo ;
                break;
            case '*' :
                result =  operandOne * operandTwo ;
                break;
            case '/' :
                result =  operandOne / operandTwo ;
                break;
            default:
                break;
        }

        System.out.println(operandOne +" "+operator +""+operandTwo +" = "+result);



    }
}
