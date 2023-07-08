package programmers.level0;

public class Programmers181941 {
  public String solution(String[] arr) {
    StringBuilder sb = new StringBuilder();

    for(String s: arr) {
      sb.append(s);
    }

    return sb.toString();
  }

  public String solution2(String[] arr) {
    return String.join("", arr);
  }

  public static void main(String[] args) {
    Programmers181941 t = new Programmers181941();

    String[] arr = {"a","b","c"};
    System.out.println(t.solution(arr).equals("abc"));
    System.out.println(t.solution2(arr).equals("abc"));
  }
}
