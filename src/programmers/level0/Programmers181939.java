package programmers.level0;

public class Programmers181939 {

  public int solution(int a, int b) {

    return Math.max(Integer.parseInt("" + a + b), Integer.parseInt("" + b + a));
  }

  public static void main(String[] args) {
    Programmers181939 t = new Programmers181939();

    System.out.println(t.solution(9, 91) == 991);
  }
}
