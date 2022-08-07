// 스택
package chanki.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q10828 {
    public static void main(String[] args) throws IOException {
        ArrayList num = new ArrayList<Integer>();
        int length;
        String[] command;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        length = Integer.parseInt(br.readLine());
        for (int i = 0; i < length; i++) {
            command = br.readLine().split(" ");
            if (command[0].equals("push")) {
                num.add(Integer.parseInt(command[1]));
            } else if (command[0].equals("pop")) {
                if (num.isEmpty())
                    System.out.println("-1");
                else {
                    System.out.println(num.remove(num.size() - 1));
                }
            } else if (command[0].equals("size")) {
                System.out.println(num.size());
            } else if (command[0].equals("empty")) {
                if (num.isEmpty())
                    System.out.println("1");
                else
                    System.out.println("0");
            } else if (command[0].equals("top")) {
                if (num.isEmpty())
                    System.out.println("-1");
                else
                    System.out.println(num.get(num.size() - 1));
            }
        }
    }
}