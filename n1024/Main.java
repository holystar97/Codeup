package n1024;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[] chs=str.toCharArray();
		for(int i=0; i<chs.length; i++) {
			System.out.printf("'%c'", chs[i]);
			System.out.println();
		}
	}

}
