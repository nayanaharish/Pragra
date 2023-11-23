package methodoveload;

public class MethodOveloadingWithAdd {
    public static void main(String[] args) {

       //invoke overloaded method with two arguments
        System.out.println( addNumbers(1,2));
      //invoke overloaded method with three arguments
        System.out.println(addNumbers(1,2,3));


    }

    public static  int addNumbers(int num1 ,int num2)
    {
        return num1 + num2 ;
    }

    public static  int addNumbers(int num1 ,int num2 ,int num3)
    {
        return num1 + num2 + num3 ;
    }
}
