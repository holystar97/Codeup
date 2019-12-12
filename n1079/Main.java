package n1079;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char value = 'a';
		do {
			value = scan.next().charAt(0);
			System.out.println(value);
		} while(value != 'q');
		scan.close();	
	
		
		
	}

}
