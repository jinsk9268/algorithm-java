package programmers.level0;

public class Programmers181935 {

  public int solution(int n) {
    int ans = 0;

    if (n % 2 == 0) {
      for (int i = 2; i <= n; i += 2) {
        ans += (i * i);
      }
    } else {
      for (int i = 1; i <= n; i += 2) {
        ans += i;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    Programmers181935 t = new Programmers181935();

    System.out.println(t.solution(7) == 16);
  }
}
