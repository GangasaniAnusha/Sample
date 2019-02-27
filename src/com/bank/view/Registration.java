package com.bank.view;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.bank.model.User;



public class Registration {

	public static void main(String[] args) {
		ArrayList<User> p=new ArrayList<>();
		p.add(getInfo());
		p.add(getInfo());
		try {
			FileOutputStream fileoutputstream=new FileOutputStream("D:\\User.txt");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileoutputstream);
			objectOutputStream.writeObject(p);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

	private static User getInfo() {
		Scanner sc=new Scanner(System.in);
		User s=new User();
		s.setFirstname(sc.next());
		s.setLastname(sc.next());
		s.setAadharcard(sc.nextLong());
		s.setAccountNo(sc.nextLong());
		s.setAccounttype(sc.next());
		s.setPancardNo(sc.next());
		s.setPhoneNo(sc.nextLong());
		s.setAddress(sc.next());
		return s;
	}

	}


