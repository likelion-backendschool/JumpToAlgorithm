import java.util.*;
import java.io.*;

public class Q1874 {
	
		
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		final char push = '+';
		final char pop = '-';
		
		int count = Integer.parseInt(br.readLine());
		
		//다음으로 들어올 오름차순 수 셋팅
		int start = 1;
		
		while(count-->0) {
			
			int n = Integer.parseInt(br.readLine());
			
			//1. 현재 입력받은 수가 아직 스택에 추가되기 전이거나 스택에 추가된 마지막 수 일때
			if(start <= n) {
				for(int i = start; i <= n; i++) { // 입력받은 수 까지 스택에 추가
					stack.push(i);
					sb.append(push+"\n");
				}				
				start = stack.pop() + 1; 
				//스택에서 n을 빼주고, start에 1을 더해 다음에 들어올 수 정의
				sb.append(pop+"\n");	
				continue;
				
			}
			//2. 현재 입력받은 수가 이미 스택에 입력된 수 일때
			
			if(stack.peek() != n) { 
				// 스택은 맨 뒤에 들어온 값만 가져올 수 있으므로 n이 stack의 top이 아니라면 break
				sb = new StringBuilder().append("NO");
				break;
				}
				//예외조건을 위에서 처리했으므로 나머지는 모두 맞는 경우, stack을 pop 해준다
				stack.pop();
				sb.append(pop+"\n");
			}					
		
		
		bw.write(sb.toString());
		bw.close();
		br.close();
				
	}
}