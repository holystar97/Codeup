package n1019;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringTokenizer tokens=new StringTokenizer(str,".");
		String [] array=new String[tokens.countTokens()];
		int[] iarray=new int[array.length];
		int i=0;
		while(tokens.hasMoreElements()) {
			array[i++]=tokens.nextToken();
		}
	
		for(i=0; i<array.length;i++) {
			
			iarray[i]=Integer.parseInt(array[i]);

		}
			
		System.out.printf("%04d",iarray[0]);
		System.out.print(".");
		System.out.printf("%02d",iarray[1]);
		System.out.print(".");
		System.out.printf("%02d",iarray[2]);
		
		
	}

}
