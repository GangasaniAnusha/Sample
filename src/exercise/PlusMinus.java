package exercise;

import java.util.Scanner;

public class PlusMinus {
	static double count=0;
	static double count1=0;
	static double count2=0;
	static void PlusMinus(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count++;
			}
			if(arr[i]>0.0) {
				count1++;
			}
			if(arr[i]<0.0) {
				count2++;
			}
		}
		System.out.println("the zero count is"+count/arr.length);
		System.out.println("the positive count is"+count1/arr.length);
		System.out.println("the negative count is"+count2/arr.length);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[6];

for(int i=0;i<arr.length;i++) {
	System.out.println("enter values");
int num=sc.nextInt();
arr[i]=num;
}
PlusMinus p= new PlusMinus();
p.PlusMinus(arr);
	
	}

}
