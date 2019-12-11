package n1020;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String num[]=str.split("-");
		
		for(int i=0; i<num.length;i++) {
			System.out.print(num[i]);
		}
		
	}

}
