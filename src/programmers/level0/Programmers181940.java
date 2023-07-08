package programmers.level0;

public class Programmers181940 {

  public String solution(String myString, int k) {
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < k; i++) {
      sb.append(myString);
    }

    return sb.toString();
  }

  public String solution2(String myString, int k) {
    return myString.repeat(k);
  }

  public static void main(String[] args) {
    Programmers181940 t = new Programmers181940();

    System.out.println(t.solution("string", 3).equals("stringstringstring"));
    System.out.println(t.solution2("string", 3).equals("stringstringstring"));
  }
}
