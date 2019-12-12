package n1080;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=1;
		int sum=0;
		while(true) {
			sum+=n;
			if(sum>=m) {
				break;
			}
			n=n+1;
		}
		System.out.println(n);
		
		
	}

}
