package SwitchStatement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        char repeat = 'y';
        while(repeat=='y') {
            System.out.println("Enter the first operand ");
            Scanner scanner = new Scanner(System.in);
            double op1 = scanner.nextInt();
            System.out.println("Enter the second operand ");
            double op2 = scanner.nextInt();
            System.out.println("Enter the operation to be performed:");
            System.out.println("1. Add\n2. Subtraction\n3 .Multiplication\n4 .Division");
            int operand = scanner.nextInt();
            String result = calculationProcess(operand, op1, op2);
            System.out.println("Result:\n " + result);
            System.out.println("Do you want to continue please press y otherwise enter n");
            repeat = scanner.next().charAt(0);
        }

    }

    public static String calculationProcess(int operand , double op1 , double op2 )
    {
        char op = ' ';
        double  result = 0.0;
        switch (operand)
        {
            case 1 : op = '+';
                result = add(op1, op2) ;
                break ;
            case 2 : op = '-';
                result = sub(op1,op2) ;
                break ;
            case 3 : op = '*';
                result = mul(op1,op2);
                break ;
            case 4 : op = '/';
                result = div(op1,op2) ;
                break ;

        }
        return op1+" "+op+" "+op2 + " = "+result ;
    }
    public static double add(double op1 ,double op2)
    {
        return op1 + op2;
    }
    public static double sub(double op1 ,double op2)
    {
        return op1 - op2;
    }
    public static double mul(double op1 ,double op2)
    {
        return op1 * op2;
    }
    public static double div(double op1 ,double op2)
    {
        return op1 / op2;
    }

}
