package methodoveload;

public class AreaCalculator {
    public static void main(String[] args) {

        //area of rectangel
        System.out.println();
        System.out.println(calculateArea(1,2));

        //area of a square
        System.out.println(calculateArea(2));
    }

    public  static  String calculateArea(double length , double width)
    {

        return "Area of a rectangle with length "+length +" and "+width +" is: "+ length * width ;
    }

    public static String calculateArea(double side)
    {
        return "Area of a square with side "+side +" is" + side * side ;
    }
}
