package n1082;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		char floor=sc.next().charAt(0);
		
		switch(floor) {
		case 'A':
			gugu(10);
			break;
		case 'B':
			gugu(11);
			break;
		case 'C':
			gugu(12);
			break;
		case 'D':
			gugu(13);
			break;
		case 'E':
			gugu(14);
			break;
		case 'F':
			gugu(15);
			break;
		default:
			break;
		}
	}
	
	static void gugu(int floor) {
		for(int i=1 ;i <16; i++) {
			System.out.println(String.format("%X*%X=%X", floor,i,i*floor));
		}	
	}
}
