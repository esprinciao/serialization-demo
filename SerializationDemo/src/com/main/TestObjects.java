package com.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObjects {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		PurchaseOrder po = new PurchaseOrder("1234","Lenovo",100,90);
		
		
		FileOutputStream fos = new FileOutputStream("pofile.dat");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(po);
		
		FileInputStream fis = new FileInputStream("pofile.dat");
		
		ObjectInputStream iis = new ObjectInputStream(fis);
		
		Object obj = iis.readObject();
		PurchaseOrder ref = (PurchaseOrder) obj;
		
		System.out.println(ref);
	}

}
