package Day5;

import java.util.Scanner;

public class BOJ8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n + 1; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
