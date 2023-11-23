package loops;

public class FibonacciSeries {


    public static void main(String[] args) {

        for (int i = 0 , j =0 , k = 1 ; i < 20 ; i++)
        {
           System.out.println(j);
           int fib = j + k ;
            j = k ;
            k = fib;
        }
    }
}
