package n1045;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int add=a+b;
		System.out.println(add);
		int min=a-b;
		System.out.println(min);
		int mul=a*b;
		System.out.println(mul);
		int odd=a/b;
		System.out.println(odd);
		int rest=a%b;
		System.out.println(rest);
		double value=((double)a/b);
		System.out.printf("%.2f",value);
		
		
		
	}

}
