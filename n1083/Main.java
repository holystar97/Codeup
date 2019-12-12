package n1083;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			if(i%3==0) {
				System.out.print("X"+" ");
			}
			else {
				System.out.print(i+" ");
			}
		}
		
		
	}

}
