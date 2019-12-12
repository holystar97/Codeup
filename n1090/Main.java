package n1090;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		long a=sc.nextInt();
		long r=sc.nextInt();
		long n=sc.nextInt();

		long c=0;
		while(true) {
			c++;
			if(c==n) {
				break;
			}
			a*=r;
		
			
			
		}
		System.out.println(a);
				
	}

}
