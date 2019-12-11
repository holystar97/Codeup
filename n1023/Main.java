package n1023;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringTokenizer st=new StringTokenizer(str,".");
		String []array=new String[st.countTokens()];
		
		int i=0;
		while(st.hasMoreElements()) {
			array[i++]=st.nextToken();
		}
		
		for(i=0; i < array.length ; i++){
			System.out.println(array[i]);
		}
		
	}

}
