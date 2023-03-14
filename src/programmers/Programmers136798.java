package programmers;

/**
 * 기사단원의 무기
 * 문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/136798
 * 참고 링크 : https://devmoony.tistory.com/169
 */
public class Programmers136798 {
    static int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            answer += getDivisor(i) > limit ? power : getDivisor(i);
        }

        return answer;
    }

    static int getDivisor(int number) {
        int count = 0;
        for (int i = 1; i * i <= number; i++) {
            if (i * i == number) {
                count++;
            } else if (number % i == 0) {
                count += 2;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(solution(5, 3, 2));
        System.out.println(solution(10, 3, 2));
    }
}
