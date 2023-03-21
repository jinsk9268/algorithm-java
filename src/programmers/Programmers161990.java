package programmers;

import java.util.Arrays;

/**
 * 바탕화면 정리 (https://school.programmers.co.kr/learn/courses/30/lessons/161990)
 */
public class Programmers161990 {
    static int[] solution(String[] wallpaper) {
        int minLeft = wallpaper.length;
        int minRight = wallpaper[0].length();
        int maxLeft = 0;
        int maxRight = 0;

        for (int i = 0; i < wallpaper.length; i++) {
            if (wallpaper[i].indexOf("#") == -1) {
                continue;
            }

            minLeft = Math.min(minLeft, i);
            minRight = Math.min(minRight, wallpaper[i].indexOf("#"));
            maxLeft = Math.max(maxLeft, i);
            maxRight = Math.max(maxRight, wallpaper[i].lastIndexOf("#"));
        }

        return new int[]{minLeft, minRight, maxLeft + 1, maxRight + 1};
    }

    public static void main(String[] args) {
        String[] wallpaper = {".#...", "..#..", "...#."};
        System.out.println(Arrays.toString(solution(wallpaper)));

        wallpaper = new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."};
        System.out.println(Arrays.toString(solution(wallpaper)));

        wallpaper = new String[]{".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
        System.out.println(Arrays.toString(solution(wallpaper)));

        wallpaper = new String[]{"..", "#."};
        System.out.println(Arrays.toString(solution(wallpaper)));
    }
}
