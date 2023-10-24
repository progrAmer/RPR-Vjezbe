package ba.unsa.etf.rpr;

public class Main {

  public static void main(String[] args) {
    for (String arg : args) {
      if (Calculator.isNumber(arg)) {
        System.out.printf("Number: %s; Factorial %d; Sine: %f%n",
            arg,
            Calculator.factorial(Integer.parseInt(arg)),
            Calculator.sine(Integer.parseInt(arg)));
      } else {
        System.out.println("Not a number: " + arg);
      }
    }
  }
}