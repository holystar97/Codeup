package n1092;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		
		int day=1;
		boolean flag=true;
		while(day %a!=0 || day%b!=0 || day%c!=0) {
			day++;
			
			if(day >=(Integer.MAX_VALUE-2)) {
				System.out.println("값을 못찾음");
				flag=false;
				break;
			}
		}
		if(flag) System.out.println(day);
	
	}

}
