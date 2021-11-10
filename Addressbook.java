package addressBook;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Addressbook {
	ArrayList<PersonInfo> Persons; // want to store the PersonInformation in ArrayList and declared variable as "person"

	public Addressbook() // address book class constructor

	{
		Persons = new ArrayList<PersonInfo>();
	}

// add new person record to array list	after taking input
	
	public void addPerson() {
		String name = JOptionPane.showInputDialog("Enter Name");    //The ‘javax.swing.JOptionPane’ class offers dialog box methods.
		String address = JOptionPane.showInputDialog("Enter Address");
		String phoneNum = JOptionPane.showInputDialog("Enter phoneNumber");
		
		// construct new person object
		
		PersonInfo p = new PersonInfo(name, address, phoneNum);

		// add above PersonInfo object to array list
		Persons.add(p);
	}
	// search person record by name by iterating over ArrayList

	public void searchPerson(String n) {
		for (int i = 0; i < Persons.size(); i++) {
			PersonInfo p = (PersonInfo) Persons.get(i); // DownCasting
			if (n.equals(p.getName())) {
				p.print();
			}
		} // end for
	}     // end Search person
}
