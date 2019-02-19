package exercise;

import java.util.Scanner;

public class ObjectPassing {
Person p1=new Person();
Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectPassing p=new ObjectPassing();
		p.display(p.accept());
	}

	private void display(Object accept) {
		System.out.println(p1.getName());
		System.out.println(p1.getSurname());
		System.out.println(p1.getAge());
		
	}

	private Object accept() {
		System.out.println("enter name");
		p1.setName(sc.next());
		System.out.println("enter surname");
		p1.setSurname(sc.next());
		System.out.println("enter age");
		p1.setAge(sc.nextInt());
		return null;
		
			}

}
