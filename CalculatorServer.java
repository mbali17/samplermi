package com.ali.rmi; 

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import com.ali.rmi.CalculatorImpl;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import com.ali.rmi.CalculatorImpl;
import java.util.Scanner;

public class CalculatorServer {
	public static void main(String args[]){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the server ip address");
			String serverIp = sc.next();
			System.setProperty("java.rmi.server.hostname",serverIp);
			CalculatorImpl calc = new CalculatorImpl();
			Registry registry = LocateRegistry.getRegistry();
			registry.bind("calculatorserver", calc);
			System.out.println("Server started sucessfully");
		}catch(RemoteException e){
			System.out.println("RemoteException in the server"+ e.getMessage());
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("Some exception in the server"+ e.getMessage());
			e.printStackTrace();
		}
	}
}