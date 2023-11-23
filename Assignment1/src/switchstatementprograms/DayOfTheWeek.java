package switchstatementprograms;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day of the week");
        String dayOfTheWeek = scanner.next().toLowerCase();
        switch (dayOfTheWeek)
        {
            case "monday" :
            case "tuesday" :
            case "wednesday" :
            case "thursday" :
            case "friday" :
                System.out.println("it's a week day!!!!");
                break;
            case "saturday":
            case "sunday":
                System.out.println("it's a weekend!!!");
                break;
            default:
                System.out.println("Invalid Input!!");

        }
    }
}
