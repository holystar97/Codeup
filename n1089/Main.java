package n1089;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int d=sc.nextInt();
		int n=sc.nextInt();

		int c=0;
		while(true) {
			c++;
			if(c==n) {
				break;
			}
			a+=d;
		
			
			
		}
		System.out.println(a);
		
	}

}
