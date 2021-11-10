package addressBook;

import javax.swing.JOptionPane;

public class PersonInfo
{
private String name;
private String address;
private String phoneNum;
// setters
public void setName(String Sname)
{
	name=Sname;
}
public void setAddress(String Saddress)
{
	address=Saddress;
}
public void setPhoneNum(String SphoneNum)
{
	phoneNum=SphoneNum;
}
	
//  getters
public String getName()
{
	return name;
}
public String getAddress()
{
	return address;
}
public String getPhoneNum()
{
	return  phoneNum;
}	
//parameterized constructor
public PersonInfo(String n,String a,String p)
{
	setName(n);
	setAddress(a);
	setPhoneNum(p);
}
	//method for displaying person record on GUI
public void print()
{
	JOptionPane.showMessageDialog(null, "name:"+name+"address:"+address+"phone number:"+phoneNum);
}
}
