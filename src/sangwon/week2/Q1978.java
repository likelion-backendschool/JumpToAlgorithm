import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1978 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		//StringTokenizer의 hasMoreTokens 메소드를 사용 할 것이므로 필요 없음
		int n = Integer.parseInt(br.readLine());
		int ans = 0;
		
		int arr[] = new int[1001];
		//에라토스테네스의 체 사용하기 위해 배열을 숫자로 채워넣기
		for(int i = 2; i <= 1000; i++) {
			arr[i] = i;
		}
		// 에라토스테네스의 체
		for(int i = 2; i <= 1000; i++) {
			if(arr[i] == 0) continue;
			
			for(int j = 2*i; j <= 1000; j+=i) {
				arr[j] = 0;
			}
		}
		
		st = new StringTokenizer(br.readLine());
		
		/* 소수가 아니면 0으로 치환했으므로, 0이 아니라면 출력하면 됨!
		 * 수의 범위가 작으므로 입력되는 수마다 소수판별을 해도 상관은 없지만,
		 * 수의 갯수가 주어지고 입력되는 수들에 대해 소수를 판별하는 문제이므로
		 * 에라토스테네스를 처음에 1번만 만들고 계속 사용할수 있음		 * 
		 */
		
		//다음 토큰이 있을 때 까지(입력된 수의 마지막 까지)
		while(st.hasMoreTokens()) {
			int tmp = Integer.parseInt(st.nextToken());
			if(arr[tmp] != 0) ans++;
		}
		
		bw.write(ans+"");
		bw.flush();
		bw.close();
		
	}
}
