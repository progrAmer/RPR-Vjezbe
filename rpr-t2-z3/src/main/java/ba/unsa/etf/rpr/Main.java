package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Collections;
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
    }
    System.out.printf("List: %s%n", numbers);
    System.out.printf("Min number in list is: %d%n", Collections.min(numbers));
    System.out.printf("Max number in list is: %d%n", Collections.max(numbers));
    System.out.printf("Mean is: %f%n", getMean(numbers));
    System.out.printf("Standard deviation is: %f%n", getStandardDeviation(numbers));

  }

  public static double getMean(List<Integer> numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }

    return (double) sum / numbers.size();
  }

  public static double getStandardDeviation(List<Integer> numbers) {
    double mean = getMean(numbers);
    double sum = 0;

    for (Integer number : numbers) {
      sum += Math.pow((number - mean), 2);
    }

    return Math.sqrt(sum / numbers.size());
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