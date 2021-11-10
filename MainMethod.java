package addressBook;


import javax.swing.JOptionPane;

public class MainMethod {

    public static void main(String[] args) {
       Addressbook ab=new Addressbook();
       String input,s;
       int cs;
       while(true)          //The while loop will iterate while the user input can't be parsed to an int. When the user input is parsed to int
    	                    //the loop exits by returning the number entered by the user.
       {
    	   input=JOptionPane.showInputDialog(" enter 1 to add"+"\n Enter 2 to search"+"\n enter 3 to exit" );
    	   cs=Integer.parseInt(input);
    	   switch(cs)
    	   {
    	   case 1:
    		   ab.addPerson();
    		   break;
    	   case 2:
    		   s=JOptionPane.showInputDialog("enter the name to search ");
    		   ab.searchPerson(s);
    		   break;
    		   
    	   case 3:
    		   System.exit(0);
    	   
    	   }
    	   
       }      //end while loop
        }     // end main
    }