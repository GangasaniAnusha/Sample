package com.bank.view;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.bank.model.*;



public class RegistrationDeserializable {

	public static void main(String[] args) {
		User p=new User();
		try {
			FileInputStream fileInputStream=new FileInputStream("D:\\User.txt");
			ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
			ArrayList<User> a=(ArrayList<User>)objectInputStream.readObject();
			p=a.get(1);
			System.out.println(p.getFirstname()+"   "+p.getLastname()+"\n"+"AAdhar :"+p.getAadharcard()+"\n account no:"+p.getAccountNo()+"\n Accounttype :"+p.getAccounttype()+"\n Pancardno"+p.getPancardNo()+"\n phone no :" +p.getPhoneNo()+"\n address" +p.getAddress());
		}
		catch (Exception e) {
			e.printStackTrace();
		}


	}

}
