import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
//			System.out.println(a);
//			System.out.println(b);
			if (a == 0 && b == 0) {
				break;
			} else {
				int sum = a + b;
				bw.write(String.valueOf(sum));
				bw.newLine();
				bw.flush();
			}
		}
		br.close();
		bw.close();
	}
}