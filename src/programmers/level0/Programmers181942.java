package programmers.level0;

public class Programmers181942 {
  public String solution(String str1, String str2) {
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < str1.length(); i++) {
      sb.append(str1.charAt(i)).append(str2.charAt(i));
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    Programmers181942 t = new Programmers181942();

    System.out.println(t.solution("aaaaa", "bbbbb").equals("ababababab"));
  }
}
