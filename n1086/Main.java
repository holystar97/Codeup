package n1086;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long w=sc.nextInt();
		long h=sc.nextInt();
		long b=sc.nextInt();
		
		double result=(w*h*b)/8;
		result/=(Math.pow(2,10)*(Math.pow(2,10)));
		System.out.format("%.2f MB",result);
		
		
	}

}
