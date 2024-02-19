package Day11;

import java.util.Scanner;

public class BOJ10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int muliplex = 1;
        if (n < 2) {
            System.out.println(1);
        } else {
            for (int i = 1; i < n+1; i++) {
                muliplex = muliplex * i;
            }
            System.out.println(muliplex);
        }
    }
}
