package com.collection.addressbook;

public class Employee {
       private int empno;         //instance variable
	   private String ename;
	   private int salary;

	   Employee(int empno, String ename, int salary)
	   {
	      this.empno = empno;                         //initializing variable using constructor,whenever the constructor called 
	                                                  //   i want to initialize the instance variable 
	      this.ename = ename;
	      this.salary = salary;
	   }

	   public int getEmpno()              // user can access the employee number with this statement, as we declared above as private
	   {
	      return empno;
	   }
	   public int getSalary()
	   {
	      return salary;
	   }
	   public String getEname()
	   {
	      return ename;
	   }

	   public String toString()       /*If we want to represent an object of a class as a String, 
	                                    then we can use the toString() method which returns a textual representation of the object.
	                                    When you print an object, by default the Java compiler invokes the toString() method on the object.*/
	   {
	      return empno+" "+ename+" "+salary;
	   }
	
}


