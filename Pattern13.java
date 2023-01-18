package patterns;

import java.util.Scanner;

public class Pattern13 {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int mid=(n/2)+1;
	    int i=1;

	    while(i<=mid) {
	        int spaces=1;
	        while(spaces<=(n/2)-i+1) {
	            System.out.print(' ');
	            spaces=spaces+1;
	        }
	        int stars=1;
	        while(stars<=2*i-1) {
	            System.out.print("*");
	            stars=stars+1;
	        }
	        System.out.println();
			i++;
	    }
	        
//	        i = n -mid;
//	        
//	        while(i>0)
//			{
//	            int spaces=1;
//	            while(spaces<=n-i-1) {
//	            	System.out.print(' ');
//	            	spaces=spaces+1;
//	        	}
//	            
//	        	int stars=1;
//	        	while(stars<=2*i-1) {
//	        	    System.out.print("*");
//	        	    stars=stars+1;
//		
//	        	}
//	        	System.out.println();
//	        	i=i-1;
//	        }
	    

	}
}
