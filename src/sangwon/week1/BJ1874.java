import java.util.*;
import java.io.*;

public class BJ1874 {
	
		
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		final char push = '+';
		final char pop = '-';
		
		int count = Integer.parseInt(br.readLine());
		
		//�������� ���� �������� �� ����
		int start = 1;
		
		while(count-->0) {
			
			int n = Integer.parseInt(br.readLine());
			
			//1. ���� �Է¹��� ���� ���� ���ÿ� �߰��Ǳ� ���̰ų� ���ÿ� �߰��� ������ �� �϶�
			if(start <= n) {
				for(int i = start; i <= n; i++) { // �Է¹��� �� ���� ���ÿ� �߰�
					stack.push(i);
					sb.append(push+"\n");
				}				
				start = stack.pop() + 1; 
				//���ÿ��� n�� ���ְ�, start�� 1�� ���� ������ ���� �� ����
				sb.append(pop+"\n");	
				continue;
				
			}
			//2. ���� �Է¹��� ���� �̹� ���ÿ� �Էµ� �� �϶�
			
			if(stack.peek() != n) { 
				// ������ �� �ڿ� ���� ���� ������ �� �����Ƿ� n�� stack�� top�� �ƴ϶�� break
				sb = new StringBuilder().append("NO");
				break;
				}
				//���������� ������ ó�������Ƿ� �������� ��� �´� ���, stack�� pop ���ش�
				stack.pop();
				sb.append(pop+"\n");
			}					
		
		
		bw.write(sb.toString());
		bw.close();
		br.close();
				
	}
}