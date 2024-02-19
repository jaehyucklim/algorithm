package Day14;

import java.util.Scanner;

public class BOJ10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int v = sc.nextInt();

        int count = 0;
        for (int num : A) {
            if (num == v) {
                count++;
            }
        }
        System.out.println(count);
    }
}
