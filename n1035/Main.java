package n1035;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String  num = scan.nextLine();
		int res=Integer.parseInt(num, 16);
		String octNum=Integer.toOctalString(res);
		System.out.println(octNum);

	}

}
