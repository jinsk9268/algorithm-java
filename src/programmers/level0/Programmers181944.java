package programmers.level0;

import java.util.Scanner;

public class Programmers181944 {

  public void solution() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(n + " is " + (n % 2 == 0 ? "even" : "odd"));
  }

  public static void main(String[] args) {
    Programmers181944 t = new Programmers181944();

    t.solution();
  }
}
