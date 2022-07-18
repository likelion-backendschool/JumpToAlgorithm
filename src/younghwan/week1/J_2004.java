package July_4;

import java.util.Scanner;

public class J_2004 {
    //num에서 5를 몇개까지 나눌 수 있는지 구하기
    public static int getFivePower(int num){
        int cnt = 0;
        while (num >= 5){
            cnt += num/5;
            num /= 5;
        }
        return cnt;
    }
    //num에서 2를 몇개까지 나눌 수 있는지 구하기
    public static int getTwoPower(int num){
        int cnt = 0;
        while (num >= 2){
            cnt += num/2;
            num /= 2;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int five = getFivePower(n) - getFivePower(n-m) - getFivePower(m);
        int two = getTwoPower(n) - getTwoPower(n-m) - getTwoPower(m);

        System.out.println(Math.min(five, two));
    }
}