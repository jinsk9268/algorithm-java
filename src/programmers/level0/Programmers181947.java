package programmers.level0;

import java.util.Scanner;

public class Programmers181947 {

  public void solution() {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.printf("%d + %d = %d", a, b, a + b);
  }

  public static void main(String[] args) {
    Programmers181947 t = new Programmers181947();

    t.solution();
  }
}
