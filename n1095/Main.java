package n1095;

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
		int min;
		int temp;
		
		for(int i=0; i<n-1; i++){ // 
            min = i;
            for(int j=i+1; j<n; j++){
                if(callArray[min] > callArray[j]){
                    min = j;
                }
            }
            temp = callArray[min];
            callArray[min] = callArray[i];
            callArray[i] = temp;
        }

		
		System.out.println(callArray[0]);


		
		
		
	}

}
