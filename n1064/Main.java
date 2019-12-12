package n1064;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();
		
		long res=(a<b?a:b)<c ?  (a<b?a:b):c;
		System.out.println(res);
		
		
	}

}
