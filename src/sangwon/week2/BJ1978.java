import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ1978 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		//StringTokenizer�� hasMoreTokens �޼ҵ带 ��� �� ���̹Ƿ� �ʿ� ����
		int n = Integer.parseInt(br.readLine());
		int ans = 0;
		
		int arr[] = new int[1001];
		//�����佺�׳׽��� ü ����ϱ� ���� �迭�� ���ڷ� ä���ֱ�
		for(int i = 2; i <= 1000; i++) {
			arr[i] = i;
		}
		// �����佺�׳׽��� ü
		for(int i = 2; i <= 1000; i++) {
			if(arr[i] == 0) continue;
			
			for(int j = 2*i; j <= 1000; j+=i) {
				arr[j] = 0;
			}
		}
		
		st = new StringTokenizer(br.readLine());
		
		/* �Ҽ��� �ƴϸ� 0���� ġȯ�����Ƿ�, 0�� �ƴ϶�� ����ϸ� ��!
		 * ���� ������ �����Ƿ� �ԷµǴ� ������ �Ҽ��Ǻ��� �ص� ����� ������,
		 * ���� ������ �־����� �ԷµǴ� ���鿡 ���� �Ҽ��� �Ǻ��ϴ� �����̹Ƿ�
		 * �����佺�׳׽��� ó���� 1���� ����� ��� ����Ҽ� ����		 * 
		 */
		
		//���� ��ū�� ���� �� ����(�Էµ� ���� ������ ����)
		while(st.hasMoreTokens()) {
			int tmp = Integer.parseInt(st.nextToken());
			if(arr[tmp] != 0) ans++;
		}
		
		bw.write(ans+"");
		bw.flush();
		bw.close();
		
	}
}
