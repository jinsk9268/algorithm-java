package programmers.level0;

public class Programmers181943 {

  public String solution(String myString, String overwriteString, int s) {
    StringBuilder sb = new StringBuilder();

    return sb.append(myString.substring(0, s))
        .append(overwriteString)
        .append(myString.substring(s + overwriteString.length()))
        .toString();
  }

  public String solution2(String myString, String overwriteString, int s) {
    char[] myArr = myString.toCharArray();
    char[] overArr = overwriteString.toCharArray();

    for(int i = 0; i < overwriteString.length(); i++) {
      myArr[s + i] = overArr[i];
    }

    return String.valueOf(myArr);
  }

  public static void main(String[] args) {
    Programmers181943 t = new Programmers181943();

    String myString = "He11oWor1d";
    String overwriteString = "lloWorl";
    int s = 2;

    System.out.println(t.solution(myString, overwriteString, s).equals("HelloWorld"));
    System.out.println(t.solution2(myString, overwriteString, s).equals("HelloWorld"));
  }
}
