package younghwan.week4;

import java.util.Scanner;

public class Q1629 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();


        long mult = (long) (Math.pow(a, b) % c);

        System.out.println(mult);

    }
}
