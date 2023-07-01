package programmers.level0;

import java.util.Scanner;

public class Programmers181945 {
  public void solution() {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    for(char c: str.toCharArray()) {
      System.out.println(c);
    }
  }

  public static void main(String[] args) {
    Programmers181945 t = new Programmers181945();

    t.solution();
  }
}
