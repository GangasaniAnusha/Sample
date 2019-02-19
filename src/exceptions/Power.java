package exceptions;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt(); 
		int[] base=new int[a];
		int[] powerIndex=new int[b];
		Power p = new Power();
		if(a==b) {
			for(int i=0;i<base.length;i++)
			{
				int num=sc.nextInt();
				base[i]=num;
			}
			for(int i=0;i<powerIndex.length;i++)
			{
				int num=sc.nextInt();
				powerIndex[i]=num;
			}
			p.Power(base,powerIndex);
		}
		else
		{
			System.out.println("enter the correct values");
		}
	}

	private void Power(int[] base, int[] powerIndex) {
		
		for(int k=0;k<base.length;k++) {
			 if(base[k]<0 && powerIndex[k]<0 ) {
				 try {
					throw new UserDefined();
				 }
				 catch(Exception e) {
					 System.out.println(" base and power should be positive not negative");
				 }
			 }
			 if(base[k]==0 && powerIndex[k]==0 ) {
				 try {
					 throw new UserDefined();
				 }
				 catch(Exception e) {
					 System.out.println(" base and power should be positive not zero");
				 }
			 }
				 else {
					 double x=1;
							for(int j=0;j<powerIndex[k];j++) {
								if(base[k]>0 && powerIndex[k]>0)
							x=base[k]*x;
							}
							System.out.println(x);
							x=1;
							
						}
				 }
			 }
		
		}



