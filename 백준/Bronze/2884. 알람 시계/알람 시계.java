import java.util.Scanner;

public class Main{
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int h = sc.nextInt();
	        int m = sc.nextInt();      
	        sc.close();

	        // 알람 문제
	        if(m>45){
	            System.out.println(h+" "+(m-45));
	        }else if(m<45 && h==0){
	            System.out.println((h+23)+" "+(m+15));
	        }else if(m<45 && h>0){
	            System.out.println((h-1)+" "+(m+15));
	        }else if(m==45){
	        	System.out.println(h+" "+(m-45));
	        }
	    }
	}