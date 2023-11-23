package methodoveload;

public class PrintInformationAboutDataTypes {
    public static void main(String[] args) {


        printInfo(123);
        printInfo("Nayana");
        printInfo(25.50);

    }

    public static void printInfo(int inputNum)
    {
        System.out.println("This is an integer input");
    }
    public static void printInfo(String inputString)
    {
        System.out.println("This is a String input");
    }
    public static void printInfo(double inputDouble)
    {
        System.out.println("This is a double input");
    }



}
