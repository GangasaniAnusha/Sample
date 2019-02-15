package strings;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a,b");
int a=sc.nextInt();
int b=sc.nextInt();
int[][] arr=new int[a][b];
for(int i=0;i<a;i++) {
	for(int j=0;j<b;j++) {
		System.out.println("enter value");
		int num=sc.nextInt();
		arr[i][j]=num;
	}
}
System.out.println("the values are");
for(int i=0;i<a;i++) {
	for(int j=0;j<b;j++) {
		
		System.out.print(arr[i][j]+"  ");
	}
	System.out.println();
	}
	}
}
