package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter a number: ");
      String value = scanner.nextLine();

      if (isNumber(value)) {
        numbers.add(Integer.parseInt(value));
      } else if (value.equals("stop")) {
        break;
      }

      System.out.println(numbers);
    }
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