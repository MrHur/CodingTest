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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        
        for(int i=0; i<N; i++){
            for(int j=0; j<=N-i-2; j++){
                bw.write(" ");
            }
            for(int j=0; j<=i; j++){
                bw.write("*");
            }bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
