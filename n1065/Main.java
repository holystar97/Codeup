package n1065;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long a[]=new long[3];
	
		for(int i=0; i<3; i++) {
			a[i]=sc.nextLong();
			if(a[i]%2==0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
		}
	
	}

}
