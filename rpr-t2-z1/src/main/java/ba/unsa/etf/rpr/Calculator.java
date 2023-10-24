package ba.unsa.etf.rpr;

public class Calculator {

  public static int factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact *= i;
    }

    return fact;
  }

  public static double sine(int n) {
    return Math.sin(Math.toRadians(n));
  }

  public static boolean isNumber(String x) {
    try {
      Integer.parseInt(x);
      return true;
    } catch (NumberFormatException ex) {
      return false;
    }
  }
}
