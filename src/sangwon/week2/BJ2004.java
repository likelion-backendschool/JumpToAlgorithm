import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 1. combination nCm >> n! / (n-m)!m!
// 2. (n!������ 2, 5) - ((n - m)! �� ���� 2, 5 + m!�� ���� 2,5));
// 3. ���� ���� Ǯ���� ����Ž���� 20����� �ݺ��ϹǷ� > �ð��ʰ�
// 4. 60! �̶� ����������, 60! �߿��� 5�� ����� ������ �ִ� ���� 60/5
// 5. �̸� �ݺ��Ͽ� 2�� 5�� ������ �̾Ƴ���
public class BJ2004 {
	
	static long cntFive(long five) {
		int cnt = 0;
		
		while(five >= 5) {
			cnt += five / 5;
			five /= 5;
		}
		
		return cnt;
	}
	
	static long cntTwo(long two) {
		int cnt = 0;
		
		while(two >= 2) {
			cnt += two / 2;
			two /= 2;
		}
		
		return cnt;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken());
		long m = Long.parseLong(st.nextToken());
		
		long ans[] = new long[2];
		
		ans[0] = cntTwo(n) - cntTwo(n-m) - cntTwo(m);
		ans[1] = cntFive(n) - cntFive(n-m) - cntFive(m);
		
		bw.write(Math.min(ans[0], ans[1])+"");
		bw.flush();
		bw.close();
	}
}