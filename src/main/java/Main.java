import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    Scanner scanner = new Scanner(System.in);

    String operation = "";
    while (!operation.equals("done")) {
      System.out.println("Enter an operation with parameters: \n(or type done to quit)");
      operation = scanner.next();
      int a;
      int b;
      switch (operation) {
        case "add":
          a = scanner.nextInt();
          b = scanner.nextInt();
          System.out.println(calc.add(a, b));
          break;
        case "subtract":
          a = scanner.nextInt();
          b = scanner.nextInt();
          System.out.println(calc.subtract(a, b));
          break;
        case "multiply":
          a = scanner.nextInt();
          b = scanner.nextInt();
          System.out.println(calc.multiply(a, b));
          break;
        case "divide":
          a = scanner.nextInt();
          b = scanner.nextInt();
          System.out.println(calc.divide(a, b));
          break;
        case "fibonacci":
          a = scanner.nextInt();
          System.out.println(calc.fibonacciNumberFinder(a));
          break;
        case "binary":
          a = scanner.nextInt();
          System.out.println(calc.intToBinaryNumber(a));
          break;
        case "id":
          String n = scanner.next();
          System.out.println(calc.createUniqueID(n));
          break;
        case "done": break;
        default:
          System.out.println("Sorry, that operation is invalid.");
      }
    }
    scanner.close();
  }
}
