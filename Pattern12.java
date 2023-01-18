package patterns;

import java.util.Scanner;

public class Pattern12 {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int p=1;
		int i=1;
		while(i<=n){
			int spaces=1;
			while(spaces<=n-i){
				System.out.print(' ');
				spaces=spaces+1;
			}
			p=i;
			int j=1;
			while(j<=i){
				System.out.print(p);
				p=p+1;
				j=j+1;

			}
			int dec=2*i-2;
			while(dec>=i) {
				System.out.print(dec);
				dec=dec-1;
			}
			System.out.println();
			i=i+1;
		}

	}
}