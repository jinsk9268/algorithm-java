package programmers.level0;

public class Programmers181950 {

  public String solution(String str, int n) {
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < n; i++) {
      sb.append(str);
    }

    return sb.toString();
  }

  public String solution2(String str, int n) {
    return str.repeat(n);
  }

  public static void main(String[] args) {
    Programmers181950 t = new Programmers181950();

    String str = "string";
    int n = 5;

    System.out.println(t.solution(str, n).equals("stringstringstringstringstring"));

    System.out.println(t.solution2(str, n).equals("stringstringstringstringstring"));
  }
}
