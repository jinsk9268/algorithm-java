package programmers.level0;

public class Programmers181934 {

  public int solution(String ineq, String eq, int n, int m) {
    boolean isTrue = n - m > 0 && ineq.equals(">")
        || n - m < 0 && ineq.equals("<")
        || n - m == 0 && eq.equals("=");

    return isTrue ? 1 : 0;
  }

  public static void main(String[] args) {
    Programmers181934 t = new Programmers181934();

    System.out.println(t.solution("<", "=", 20, 50) == 1);
  }
}
