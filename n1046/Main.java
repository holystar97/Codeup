package n1046;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();

		long add=a+b+c;
		System.out.println(add);
		double avg=add/3.0;
		System.out.printf("%.1f",avg);
	}

}
