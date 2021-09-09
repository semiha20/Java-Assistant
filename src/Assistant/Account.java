package Assistant;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class Account {
	static String inp;
	static String inp2;
	static String AddEv;
	public  Scanner x;
	
@SuppressWarnings("resource")
public static void main(String[] args) throws IOException {
	
	Menu m1=new Menu();
	Scanner x =new Scanner(System.in);
	System.out.println("1-Create new Account");
	System.out.println("2-LogIn");
	inp = x.nextLine();

	//THE FILES 
	File userFile= new File("users.txt");
	FileWriter fileW = new FileWriter(userFile,true);
	BufferedWriter bufferw= new BufferedWriter(fileW);
	PrintWriter printW=new PrintWriter(bufferw);
	

	
	//SIGN UP
	if(inp.equals("1")) {
	Scanner n=new Scanner(System.in);
	System.out.println("Hi, welcome to ASSISTANT. Please enter your name.");
	String name =  n.nextLine();
	Scanner user=new Scanner(System.in);
	System.out.println("Choose an username : ");
	String a = user.nextLine();
	Scanner pass=new Scanner(System.in);
	System.out.println("Choose a password : ");
	String b = pass.nextLine();
    
	
	printW.print(a);
	printW.print(" ");
	printW.println(b+"\n");
	
	printW.close();
	
	System.out.println("Welcome to ASSISTANT "+name+"\n");
	//MENU
	
		
	
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


	}
	else if(inp.equals("2")) {	
		
	LogIn L=new LogIn();
	L.open();
	L.read();
	L.close();
	     		
	}

}
}