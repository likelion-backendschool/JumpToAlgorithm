package July_4;

import java.util.*;
public class J_6588 {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int max=1000000;
        boolean[] isPrime=new boolean[max+1]; // 2~100,001 을 가진 배열

        //0,1 제외
        isPrime[0]= isPrime[1]= false;


        //에라토스테네스의 체 이용

        for(int i=2; i<=max; i++) {
            isPrime[i] = true;
        }
        for(int i=2; i<=max; i++) {
            if (isPrime[i]) {
                for (int j = i+i; j <= max; j+=i){
                    isPrime[j]= false;
                }
            }
        }

        while(true){
            int n=sc.nextInt();
            boolean ok= false;
            if(n == 0)
                break;
            for(int i=2; i<=n/2; i++){
                if (isPrime[i] && isPrime[n-i]) {  //a도 소수고 n-a도 소수이면
                    System.out.println(n + " = " + i + " + " + (n - i));
                    ok=true;
                    break;                       // 그 수는 소수의 합으로 이루어 진다

                }
            }
            if(!ok){  //소수의 합으로 나타 낼 수 없으면
                System.out.println("Goldbach's conjecture is wrong.");
            }

        }
    }
}