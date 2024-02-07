package exercise;

@FunctionalInterface
interface MathOperation{
  int Operation(int a,int b);
}

public class Main {
 
  public static void main(String[] args) {
    MathOperation addition = Main::addNumber;
    int additionResult = performOperation(10,20,addition);
    System.out.println("The result of addition two numbers is: "+additionResult);
    
    int sub = performOperation(25,10,Main::subtractNumber);
    System.out.println("The subtraction of two numbers are: " + sub);
    
    MathOperation multi = Main::multiplyNumber;
    int result1 = performOperation(5,15, multi);
    System.out.println("Multiplication of two numbers is: " + result1);
    

  }
  public static int addNumber(int a, int b) {
    return a+b;
  }
  public static int subtractNumber(int a, int b) {
    return a-b;
  }
  public static int multiplyNumber(int a, int b) {
    return a*b;
  }
  public static int performOperation(int a, int b, MathOperation operation) {
    return operation.Operation(a, b);
  }

}
