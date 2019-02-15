package strings;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int[] arr=new int[3];
int[] brr= {1,2,3};

for(int i=0;i<arr.length;i++) {
	System.out.println("enter values");
int num=sc.nextInt();
arr[i]=num;
}
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
}
	}

}
