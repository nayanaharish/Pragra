package methods;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {

        System.out.println("Enter the String :");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        String result =  palindromeChecker(inputString.toLowerCase())? inputString+" is Palindrome!!" :inputString+" is not Palindrome!!";
        System.out.println(result);
    }

    public static boolean palindromeChecker(String inputString)
    {
        for (int i = 0 , j= inputString.length() -1 ; i < inputString.length()  ; i++ ,j-- )
        {
            if (inputString.charAt(i) != inputString.charAt(j))
            {
                return false ;
            }

        }
        return true;
    }
}
