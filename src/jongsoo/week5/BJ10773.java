package jongsoo.week5;
import java.util.Scanner;
import java.util.Stack;

public class BJ_Q10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stk = new Stack<Integer>();

        int A = sc.nextInt();
        int sum = 0;

        for(int i =0; i < A; i++) {
            int num = sc.nextInt();

            if(num == 0) {
                stk.pop();
            }

            else {
                stk.push(num);
            }
        }
        for(int j : stk) {
            sum += j;
        }
        System.out.println(sum);
    }
}
