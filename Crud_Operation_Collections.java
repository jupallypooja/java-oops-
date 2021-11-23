package com.collection.addressbook;

import java.util.*;

public class Crud_Operation_Collections {

	public static void main(String[] args) {

		List<Employee> c = new ArrayList<Employee>();   // for integer      // i want to insert the data into this collection i.e., c
		Scanner s = new Scanner(System.in);                                 //to get the input from the user,i want instance of scanner
		Scanner s1 = new Scanner(System.in);            // for string
		int ch; 
		do {
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.SEARCH");
			System.out.println("4.DELETE");
			System.out.println("5.UPDATE");
			System.out.print("Enter Your Choice : ");
			ch = s.nextInt();

			switch (ch)                                      // if user want to provide data into collection then we can switch case ,as input is 1, it will switch to case 1
			{
			case 1:
				System.out.print("Enter Empno : ");           //it will get the employee name,sal,no. from user
				int eno = s.nextInt();
				System.out.print("Enter EmpName : ");
				String ename = s1.nextLine();
				System.out.print("Enter Salary : ");
				int salary = s.nextInt();

				c.add(new Employee(eno, ename, salary));         // calling the constructor of emp,here (eno,ename,esal)r values.after calling object will be created
				                                                 // that object will be added to collection c
				break;
			case 2:
				System.out.println("----------------------------");
				Iterator<Employee> i = c.iterator();             //iterator is a method,which can retrive each & every record 1 by 1
				while (i.hasNext()) {
					Employee e = i.next();                       // whenever i print the instance of emp,it will simple call the toString() & our obj will be displayed
					System.out.println(e);
				}
				System.out.println("----------------------------");
				break;
			case 3:
				boolean found = false;                           // by default record will not found 
				System.out.print("Enter Empno to Search :");
				int empno = s.nextInt();                         
				System.out.println("----------------------------");
				i = c.iterator();
				while (i.hasNext()) {
					Employee e = i.next();                   // to match with our record
					if (e.getEmpno() == empno) {             //getEmpno() can access directly because Empno declared as a private."user provided input and our recorded input get pass then print the record"
						System.out.println(e);
						found = true;
					}
				}

				if (!found) {
					System.out.println("Record Not Found");
				}
				System.out.println("----------------------------");
				break;

			case 4:
				found = false;
				System.out.print("Enter Empno to Delete :");
				empno = s.nextInt();
				System.out.println("----------------------------");
				i = c.iterator();
				while (i.hasNext()) {
					Employee e = i.next();
					if (e.getEmpno() == empno) {
						i.remove();
						found = true;
					}
				}

				if (!found) {
					System.out.println("Record Not Found");
				} 
				else 
				{
					System.out.println("Record is Deleted Successfully...!");
				}

				System.out.println("----------------------------");
				break;
			case 5:
				found = false;
				System.out.print("Enter Empno to Update :");
				empno = s.nextInt();

				ListIterator<Employee> li = c.listIterator();       //it is used to initialize the collection to list iterator  
				
				                                                       //whenever i want to update the data ,we can use list iterator,& list iterator
				                                                       //is available in list collection   
				while (li.hasNext()) {
					Employee e = li.next();
					if (e.getEmpno() == empno) {
						System.out.print("Enter new Name : ");
						ename = s1.nextLine();

						System.out.print("Enter new Salary : ");
						salary = s.nextInt();
						li.set(new Employee(empno, ename, salary));    //we can call the method i.e., li.set to change the data,and pass the object of the emp to set the data
						found = true;                               // once found it will  display ,will run else block
					}
				}

				if (!found) {
					System.out.println("Record Not Found");
				} else {
					System.out.println("Record is Updated Successfully...!");
				}

				break;

			}
		}
		
		while (ch != 0);                 // it will run the loop untill and unless user provide 0
	}

}
