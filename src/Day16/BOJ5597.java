package Day16;

import java.util.Scanner;

public class BOJ5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[31]; // 기본값 0의 30개 배열

        for (int i = 0; i < 28; i++) {
            int number = sc.nextInt();
            A[number]++; // 해당 index의 값이 있으면 0 -> 1 (0: not submitted)
        }

        for (int i = 1; i < 31; i++) {
            if (A[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
