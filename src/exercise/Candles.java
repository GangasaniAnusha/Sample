package exercise;

import java.util.Scanner;

public class Candles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		
		int[] heights=new int[no];
		for(int i=0;i<heights.length;i++) {
			System.out.println("enter values");
		int num=sc.nextInt();
		heights[i]=num;
		}
		Candles p=new Candles();
		p.Candles(heights);
	}

	private void Candles(int[] heights) {
		// TODO Auto-generated method stub
		int max=heights[0];
		int count=0;
		for(int i=0;i<heights.length;i++) {
			if(heights[i]>=max)
			{
				max=heights[i];
				count++;
			}
		}
		System.out.println("the number of candles blown   "+count);
	}

}
