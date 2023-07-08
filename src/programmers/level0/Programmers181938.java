package programmers.level0;

public class Programmers181938 {

  public int solution(int a, int b) {
    return Math.max(Integer.parseInt("" + a + b), 2 * a * b);
  }

  public static void main(String[] args) {
    Programmers181938 t = new Programmers181938();

    System.out.println(t.solution(2, 91) == 364);
  }
}
