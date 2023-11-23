package methodoveload;

public class MaxNumber {

    public static void main(String[] args) {

        System.out.println(findMax(25,2) );
        System.out.println(findMax(111,22,13) );

    }

    public static int findMax(int num1 ,int num2)
    {
        return num1 > num2 ? num1 : num2 ;
    }
    public static int findMax(int num1 ,int num2 ,int num3)
    {
        return num1 > num2 ? num1  > num3 ? num1 : num3 : num2 > num3 ? num2 : num3 ;
    }

}

