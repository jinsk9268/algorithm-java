package programmers.level0;

public class Programmers181933 {

  public int solution(int a, int b, boolean flag) {
    return flag ? a + b : a - b;
  }

  public static void main(String[] args) {
    Programmers181933 t = new Programmers181933();

    System.out.println(t.solution(-4, 7, true) == 3);
  }
}
