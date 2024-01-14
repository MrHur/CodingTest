import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();   
        int a;
        int x;
        for(a=1, x=1; a<=T; a++, x++){
            int A = sc.nextInt();
            int B = sc.nextInt(); 
            int C = A+B;
            System.out.println("Case #"+x+": "+A+" + "+B+" = "+C);
        }
        sc.close();
    }
}