import java.io.*;
import java.util.*;
class Employee
	{
	String name,address,phone;
	int age,salary;
	void printinfo()
	{
	System.out.println("Name : "+name);
	System.out.println("Address : "+address);
	System.out.println("Phone Number : "+phone);
	System.out.println("Age : "+age);
	System.out.println("Salary : "+salary);
	}
}
class Officer extends Employee
{
	String specialization;
	void printspec()
	{
	System.out.println("Specialization : "+specialization);
	}
}
class Manager extends Employee
{
	String department;
	void printdep()
	{
  	System.out.println("Department : "+department);
	}
}
class Inheritance
{
	public static void main(String[] args)
		{
		Officer off=new Officer();
		Manager man=new Manager();
		Scanner sc=new Scanner(System.in);
		System.out.println("Entering Officer Details\n");
		System.out.println("Name: ");
		off.name=sc.nextLine();
		System.out.println("Address: ");
		off.address=sc.nextLine();
		System.out.println("Specialization: ");
		off.specialization=sc.nextLine();
		System.out.println("Phone: ");
		off.phone=sc.nextLine();
		System.out.println("Age: ");
		off.age=sc.nextInt();
		System.out.println("Salary: ");
		off.salary=sc.nextInt();
		System.out.println("\n");
		off.printinfo();
		off.printspec();
		System.out.println("\n");
		sc.nextLine();
		System.out.println("Entering Manager Details\n");
		System.out.println("Name: ");
		man.name=sc.nextLine();
		System.out.println("Address: ");
		man.address=sc.nextLine();
		System.out.println("Department: ");
		man.department=sc.nextLine();
		System.out.println("Phone: ");
		man.phone=sc.nextLine();
		System.out.println("Age: ");
		man.age=sc.nextInt();
		System.out.println("Salary: ");
		man.salary=sc.nextInt();
		System.out.println("\n");
		man.printinfo();
		man.printdep();
	     	}
} 
