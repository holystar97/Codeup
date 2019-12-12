package n1093;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int callArray[]=new int[n];
		for(int i=0; i<n; i++) {
			callArray[i]=sc.nextInt();
		}
		
		int placeArray[]=new int[23];
		for(int i=0;i <23;i++) {
			placeArray[i]=0;
		}
		for(int call:callArray) {
			
			placeArray[call-1]++;
		
		}
		
		for(int place:placeArray) {
			System.out.print(place+ " ");
		}
		
	}

}
