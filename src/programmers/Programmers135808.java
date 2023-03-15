package programmers;

import java.util.*;

/**
 * 과일 장수 (https://school.programmers.co.kr/learn/courses/30/lessons/135808)
 */
public class Programmers135808 {
    static int solution(int k, int m, int[] score) {
        int answer = 0;

        if (score.length >= m) {
            Arrays.sort(score);
            for (int i = 0, j = score.length; i < score.length / m; i++, j -= m) {
                int[] mApples = Arrays.copyOfRange(score, j - m, j);
                answer += (mApples[0] * m);
            }
        }

        return answer;
    }

    static int solution2(int k, int m, int[] score) {
        int answer = 0;

        if (score.length >= m) {
            Arrays.sort(score);
            for (int i = score.length; i >= m; i -= m) {
                int[] mApples = Arrays.copyOfRange(score, i - m, i);
                answer += (mApples[0] * m);
            }
        }

        return answer;
    }

    static int solution3(int k, int m, int[] score) {
        int answer = 0;

        if (score.length >= m) {
            Arrays.sort(score);
            for (int i = score.length; i >= m; i -= m) {
                answer += score[i - m] * m;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] score = {1, 2, 3, 1, 2, 3, 1};
        System.out.println(solution(3, 4, score));

        score = new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        System.out.println(solution2(4, 3, score));
    }
}
