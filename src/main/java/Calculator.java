import java.util.ArrayList;
import java.util.Random;

/**
 * Class to imitate a calculator
 */
class Calculator {

    Calculator(){

    }

    int add(int a , int b){
        return a + b;
    }

    int subtract(int a , int b){
        return a - b;
    }

    int multiply(int a , int b){
        return a * b;
    }

    int divide(int a , int b){
        return a / b;
    }


    /*
    Returns the n'th number in the fibonacci sequence
    https://en.wikipedia.org/wiki/Fibonacci_number
    Example below
    n = x
    0 = 0
    1 = 1
    2 = 1
    3 = 2
    4 = 3
    5 = 5
    .
    .
    .
    etc
     */
    int fibonacciNumberFinder(int n){
        int answer = 0;
        ArrayList<Integer> fib = new ArrayList<Integer>();

        if (n == 0 || n == 1) {
            answer = n;
        }
        else {
            fib.add(0);
            fib.add(1);
            for (int i = 2; i <= n; i++) {
                fib.add(fib.get(i - 1) + fib.get(i - 2));
            }
            answer = fib.get(n);
        }
        return answer;
    }


    /*
    Returns binary value of the given int number
    The binary number will be stored as a string
    if int a = 0 then this method returns: 0
    if int a = 10 then this method returns: 1010
    if int a = 16 then this method returns: 10000
     */
    String intToBinaryNumber(int n){
        return Integer.toBinaryString(n);
    }

    /*
    Create a completely unique String identifier for a given string
    Each createdID must contain the string n in its unaltered Form
    if String n = "Jason"
    then the created ID could be = Jasonklfgn3jknnvksdfm - Because it contains the unaltered String n and is unique

    if you run this function twice with the same String input, it must return 2 unique String IDs
     */
    String createUniqueID(String n){
        Random r = new Random();
        String answer = n;
        for (int i = 0; i < 100; i++) {
            answer += (char)(r.nextInt('z' - 'a') + 'a');
        }
        return answer;
    }


}
