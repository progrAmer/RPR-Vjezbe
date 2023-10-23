package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");

    int n = scanner.nextInt();
    for (int i = 2; i < n; i++) {
      if (i % sumaCifara(i) == 0) {
        System.out.println(i);
      }
    }
  }

  public static int sumaCifara(int n) {
    int sum = 0;

    do {
      sum += n % 10;
      n /= 10;
    } while (n != 0);

    return sum;
  }
}