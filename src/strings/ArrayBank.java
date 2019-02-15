package strings;

import java.util.Scanner;

public class ArrayBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of customers:");
		int a=sc.nextInt();
		long[][] kotak=new long[4][a];
		long[][] customerDetails=new long[4][a];
		for(int j=0;j<a;j++) {
			for(int i=0;i<=4;i++) {
			if(i==0) {
				System.out.println("enter account no");
			    long acct=sc.nextLong();
			    customerDetails[i][j]=acct;
			}
			if(i==1) {
				System.out.println("enter aadhar no");
			    long aadhar=sc.nextLong();
			    customerDetails[i][j]=aadhar;
			}
			if(i==2) {
				System.out.println("enter balance");
			    long balc=sc.nextLong();
			    customerDetails[i][j]=balc;
			}
			if(i==3) {
				System.out.println("enter phn no");
			    long phn=sc.nextLong();
			    customerDetails[i][j]=phn;
			}
		}
		}
		for(int i=0;i<a;i++) {
			for(int j=0;j<4;j++) {
				kotak[i]=new long[4];
				kotak[i]=customerDetails[i];
			}
		}
		for(int i=0;i<kotak.length;i++) {
			for(int j=0;j<kotak[i].length;j++) {
System.out.print(kotak[i][j]+"  ");
	}
System.out.println();
		}
}
}
