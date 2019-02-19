package exceptions;

import java.util.Scanner;

public class Clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String time=sc.next();
		Clock c=new Clock();
		c.clock(time);
	}

	private void clock(String time) {
		// TODO Auto-generated method stub
		String arr[]=new String[3];
		arr=time.split(":");
		
		if(time.endsWith("PM")) {
			int x=Integer.parseInt(arr[0])+12;
			arr[0]=Integer.toString(x);
		}
		else if(time.endsWith("AM")){
				if(time.startsWith("12")) {
					int x=Integer.parseInt(arr[0])-12;
					arr[0]=Integer.toString(x);
			
		}
		}
		else {
			System.out.println("enter correct time");
			
		}
		System.out.println(arr[0]+":"+arr[1]+":"+arr[2].substring(0,2));
	}

	}
