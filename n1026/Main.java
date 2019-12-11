package n1026;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringTokenizer st=new StringTokenizer(str,":");
		String []array=new String[st.countTokens()];
		
		int i=0;
		while(st.hasMoreElements()) {
		
			array[i++]=st.nextToken();
		}
		
		for(i=0; i<array.length;i++) {
		if(array[i].equals("00")) {
			array[i]="0";
		}
		}
		System.out.println(array[1]);
		
	}
}
