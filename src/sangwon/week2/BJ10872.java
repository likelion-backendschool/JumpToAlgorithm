import java.util.*;

public class BJ10872 {
	
	
					
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int ans = 1;
		for(int i = 1; i <= a; i++) {
			ans *= i;
		}
		
		System.out.println(ans);
	}
}