package n1096;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int input[][]=new int[20][20];
		
		int x=0;
		int y=0;
		
		for(int i=0; i<n; i++) {
			x=sc.nextInt();
			y=sc.nextInt();
			
			input[x][y]=1;
		}
		
		for(int i=1; i<=19; i++) {
			for(int j=1; j<=19; j++) {
				System.out.printf("%d ",input[i][j]);
			}
			System.out.println(" ");
		}
		
	}

}
