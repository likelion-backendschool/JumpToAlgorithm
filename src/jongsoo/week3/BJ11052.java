import java.util.Scanner;
public class Q11052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] a = new int[n+1];
        int [] dp = new int[n+1];

        for(int i=1; i<=n; i++)
            a[i] = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.max(dp[i], dp[i - j] + a[j]);
            }
        }
        System.out.println(dp[n]);
    }
}