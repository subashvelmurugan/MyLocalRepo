package com.flp.ems.view;

import java.util.Scanner;

public class Bootclass {

	//private static Scanner sc;

	public static void main(String args[]){
		System.out.println("EMPLOYEE MANAGEMENT SYSTEM");
		System.out.println("Enter your choice:");
		System.out.println("1.Add Employee\n2.Modify Employee\n3.Remove Employee\n4.Search Employee\n5.Get All Employee");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		menuSelection(s);
	}
static void menuSelection(int s){
	UserInteraction u=new UserInteraction();
	switch(s)
	{
	case 1:
		//Userintersection u1=new Userinteraction();
		u.AddEmployee();
		
	case 2:
		//Userintersection u2=new UserInteraction();
		u.ModifyEmployee();
		
	case 3:
		//Userintersection u3=new Userinteraction();
		u.RemoveEmployee();
		
	case 4:
		//Userintersection u4=new Userinteraction();
		u.SearchEmployee();
		
	case 5:
		//Userintersection u5=new Userinteraction();
		u.getAllEmployee();
		
		default:
			System.out.println("In default");
	}
}

}
