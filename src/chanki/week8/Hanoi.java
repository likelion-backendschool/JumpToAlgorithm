package chanki.week8;

public class Hanoi {
    public static void main(String[] args) {
        hanoi(1, 3, 3);
    }

    static void hanoi(int a, int b, int n) {
        if(n == 1) {
            System.out.println(a + " " + b);
            return;
        }

        hanoi(a, 6 - a - b, n - 1);
        System.out.println(a + " " + b);
        hanoi(6 - a - b, b, n - 1);
    }
}
