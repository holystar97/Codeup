package n1025;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[] chs=str.toCharArray();
		int[] is=new int[chs.length];
		
		int num=10000;
		for(int i=0; i<chs.length; i++) {
			is[i]=chs[i]-'0';
			
			System.out.printf("[%d]", is[i]*num);
			System.out.println();
			num=num/10;
		}
		
		
	}
}
