package com.ali.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import com.ali.rmi.*;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator{
	public CalculatorImpl() throws RemoteException {
		super();
		System.out.println("Calculator object created successfully");
	}
	public int add(int firstNumber,int secondNumber) throws RemoteException{
		System.out.println("Calculator object added successfully");
		return firstNumber+secondNumber;
	}
}