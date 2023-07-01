package programmers.level0;

import java.util.Scanner;

public class Programmers181949 {
  public void solution() {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    StringBuilder sb = new StringBuilder();
    int diff = 'a' - 'A';

    for(char c: str.toCharArray()) {
      sb.append((char) (c >= 'a' ? c - diff : c + diff));
    }

    System.out.println(sb.toString());
    sc.close();
  }
  public static void main(String[] args) {
    Programmers181949 t = new Programmers181949();

    t.solution();
  }
}
