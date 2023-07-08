package programmers.level0;

public class Programmers181936 {

  public int solution(int number, int n, int m) {
    return number % n == 0 && number % m == 0 ? 1 : 0;
  }

  public static void main(String[] args) {
    Programmers181936 t = new Programmers181936();

    System.out.println(t.solution(60, 2, 3) == 1);
  }
}
