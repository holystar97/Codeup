package n1085;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		long h=sc.nextInt();
		long b=sc.nextInt();
		long c=sc.nextInt();
		long s=sc.nextInt();
		
		double result=(h*b*c*s)/8;
		result/=(Math.pow(2,10)*(Math.pow(2,10)));
		System.out.format("%.1f MB",result);
		
		
	}

}
