package n1084;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int g=sc.nextInt();
		int b=sc.nextInt();
		
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<g; j++) {
				for(int k=0; k<b;k++) {
					String st=i+ " " + j + " " +k;
					bf.write(st + "\n");
				}	
			}
		}
		bf.write(Integer.toString(r*g*b));
		bf.close();
	}

}
