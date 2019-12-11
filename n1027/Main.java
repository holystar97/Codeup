package n1027;

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
	
			System.out.println(array[2]+"-"+array[1]+"-"+array[0]);
	}

}
