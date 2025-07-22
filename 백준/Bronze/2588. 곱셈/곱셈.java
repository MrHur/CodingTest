import java.util.*;

public class Main{
    public static void main(String args[]){
    	  Scanner sc = new Scanner(System.in);
    	  int a = sc.nextInt();  
    	  int b = sc.nextInt();
    	  sc.close();
        
    	  int nmj1 = b%10;
    	  int nmj2 = (b%100 - nmj1)/10;
    	  int nmj3 = (b - nmj2 - nmj1)/100;
    	  System.out.println(a*nmj1);
    	  System.out.println(a*nmj2);
    	  System.out.println(a*nmj3);
    	  System.out.println(a*b);
    }
}
