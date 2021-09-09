package Assistant;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LogIn {
 static String inp2;
Menu m1=new Menu();
 public  Scanner x;
	public void open() {
		try {
			x =new Scanner(new File("users.txt"));
			
		
		}catch(Exception e) {
			System.out.println("error");
		}
	}
	
public void read() throws IOException {
	
	while(x.hasNext()) {
		String a=x.next();
		String b =x.next();
		Scanner luser=new Scanner(System.in);
		System.out.println("enter username:\n");
		String j=luser.nextLine();
		Scanner lpassword=new Scanner(System.in);
		System.out.println("enter password:\n");
		String o=lpassword.nextLine();
		if ((j.contentEquals(a))&&((o.contentEquals(b)))) {
			Scanner ch=new Scanner(System.in);
		 	System.out.println("1-add event\n2-Show events\n3-add contacts\n4-Show contacts\n5-To Do List\n6-Add to List\n7-Delete contact\n");
		 	inp2=ch.nextLine(); 
		 	if (inp2.equals("1")) {
				m1.if1();
		        m1.saved();
		}
			else if(inp2.equals("2")) {
				m1.if2();
			}
			else if (inp2.equals("3")) {
				m1.if3();
		        m1.saved();
			}
			else if (inp2.equals("4")) {
				m1.if4();
				
			}
			else if(inp2.equals("5")) {	
				m1.if5();

			}
			else if (inp2.equals("6")) {
				m1.if6();
		        m1.saved();
		}
			else if(inp2.equals("7")) {
				Scanner rtS=new Scanner(System.in);
				System.out.println("Please enter the contact name you want to remove:\n");
				String rt=rtS.nextLine();
				m1.ifseven("Contacts.txt", rt, 1, ",");
			}
		}
		else {
			System.out.println("error");
		}
		
	}
	
}

public void close() {
	x.close();
}
}
