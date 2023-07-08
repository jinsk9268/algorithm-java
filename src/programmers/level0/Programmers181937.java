package programmers.level0;

public class Programmers181937 {

  public int solution(int num, int n) {

    return num % n == 0 ? 1 : 0;
  }

  public static void main(String[] args) {
    Programmers181937 t = new Programmers181937();

    System.out.println(t.solution(98, 2) == 1);
  }
}
