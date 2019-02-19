package exercise;

import java.util.Scanner;
import java.lang.*;

public class Diagnoal {
	public void diagonalEntry() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row:");
		int i=sc.nextInt();
		System.out.println("enter coloumn:");
		int j=sc.nextInt();
		if(i==j) {
		int[][] a=new int[i][j];
		System.out.println("enter the values:");
		for(int a1=0;a1<i;a1++) {
			for(int b=0;b<j;b++) {
				int num=sc.nextInt();
				a[i][j]=num;
			}
		}
		int sum=0,sum1=0;
		for(int a1=0;a1<i;a1++) {
			for(int b=0;b<j;b++) {
				if(i==j) {
					
					sum=sum+a[i][j];
				}
				if((i+j)==(i*j)/2)
					sum1=sum1+a[i][j];
			}
			}
		int diff;
		diff=sum-sum1;
		System.out.println(Math.abs(diff));
		
		}
	
		
		else {
			System.out.println("enter an n x n matrix order");
		}
}

		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diagnoal d=new Diagnoal();
		d.diagonalEntry();
		
	}

}
