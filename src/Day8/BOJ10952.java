package Day8;

import java.util.Scanner;

public class BOJ10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (A+B == 0) {
                return;
            }
            System.out.println(A+B);
        }
    }
}
