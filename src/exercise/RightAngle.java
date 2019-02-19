package exercise;

import java.util.Scanner;

public class RightAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sides of a right angle triangle");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		RightAngle p=new RightAngle();
		p.rightAngle(a,b,c);
	}

	private void rightAngle(int a, int b, int c) {
		// TODO Auto-generated method stub
		int max;
	if(a<b && b>c) {
		max=b;
		if((b*b)==(c*c)+(a*a)) {
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}
	else if(c>a && c>b)
	{
		max=c;
		if((c*c)==(b*b)+(a*a)) {
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
	else if(a>b && a>c) {
		max=a;
		if((a*a)==(c*c)+(b*b)) {
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
	}

	

}
