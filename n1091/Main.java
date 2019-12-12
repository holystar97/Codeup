package n1091;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc=new Scanner(System.in);
		
		long a=sc.nextInt();
		long m=sc.nextInt();
		long d=sc.nextInt();
		long n=sc.nextInt();

		long c=0;
		while(true) {
			c++;
			if(c==n) {
				break;
			}
			a*=m;
			a+=d;
		}
		System.out.println(a);
		
		
		
	}

}
