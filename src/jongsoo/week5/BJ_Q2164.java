package jongsoo.week5;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> qee = new LinkedList<>();

        int N = sc.nextInt();

        for(int i = 1; i <= N; i++) {
            qee.offer(i);
        }

        for(int j = 1; j < N; j++) {
            qee.poll();
            qee.offer(qee.poll());

        }
        System.out.println(qee.poll());

    }
}