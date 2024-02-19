package Day3;

import java.util.Scanner;

public class BOJ2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) { // 1 2 3 4 n
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
