import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        String a = sc.next();
        
        int sum = 0;
        
        for(int i=0; i<N; i++){
            int result = a.charAt(i);
            sum += result - 48;
        }
        System.out.println(sum);
    }
}