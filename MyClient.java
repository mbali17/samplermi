package com.ali.rmi;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import com.ali.rmi.Calculator;
import java.util.Scanner;
public class MyClient {
	static final String PROTOCOL = "rmi://";
	public static void main(String[] args) {
		try{
			System.out.println("inside the MyClient main method");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the server ip");
			String serverIp =  sc.nextLine();
			System.out.println("Enter the remote interface that is bound");
			String remoteInterface = sc.next();
			String url = PROTOCOL+serverIp+"/"+remoteInterface;
			Calculator calculator = (Calculator) Naming.lookup(url);
			System.out.println("lookup is successfull"+calculator.toString());
			System.out.println(calculator.add(45,20));
		}catch (Exception e) {
			System.out.println("HelloClient exception: " + e.getMessage()); 
           e.printStackTrace(); 
		}
	}
}

