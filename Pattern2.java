package patterns;

import java.util.Scanner;

public class Pattern2 {
public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
//Print stars by 4*4.
	int i=1;
	while(i<=n) {
		int j=1;
		while(j<=n) {
		System.out.print(i);
		j=j+1;
	}
	System.out.println();
	i=i+1;
	}
}
}
