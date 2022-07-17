import java.util.Scanner;

public class J_2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = sc.nextInt();
        int gcdValue = gcd(a, b);
        int lcmValue = lcm(a, b, gcdValue);
        System.out.println(gcdValue);
        System.out.println( lcmValue);

    }
    //유클리드 호제법
    public static int gcd(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static int lcm(int a, int b, int gcdValue) {
        int lcmValue = gcdValue * ((a / gcdValue) * (b / gcdValue));
        return lcmValue;
    }

}