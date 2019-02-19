package exercise;

import java.util.Scanner;

public class AppleOrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int t=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int size1=sc.nextInt();
		int size2=sc.nextInt();
		
		int[] apples=new int[size1];
		int[] oranges=new int[size2];
		for(int i=0;i<apples.length;i++) {
			System.out.println("enter values");
		int num=sc.nextInt();
		apples[i]=num;
		}
		for(int i=0;i<oranges.length;i++) {
			System.out.println("enter values");
		int num=sc.nextInt();
		oranges[i]=num;
		}
		AppleOrange p=new AppleOrange();
		p.AppleOrange(s,t,a,b,apples,oranges);
	}

	private void AppleOrange(int s, int t, int a, int b, int[] apples, int[] oranges) {
		// TODO Auto-generated method stub
		int dis1,dis2;
		int countapp=0 , countorg=0;
		dis1=s-a;
		dis2=b-t;
		for(int i=0;i<apples.length;i++) {
			if(apples[i]+a>=s && apples[i]+a<=t) {
				countapp++;
			}
		}
		System.out.println("the apples falling on the house  "+countapp);
		for(int i=0;i<oranges.length;i++) {
			if(oranges[i]+b>=s && oranges[i]+b<=t) {
				countorg++;
			}
		}
		System.out.println("the oranges falling on the house  "+countorg);
	}

}
