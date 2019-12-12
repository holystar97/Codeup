package n1094;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int callArray[]=new int[n];
		for(int i=0; i<n; i++) {
			callArray[i]=sc.nextInt();
		}
		
		for(int i=n-1;i>=0;i--) {
			System.out.print(callArray[i]+" ");
		}
		
	}

}
