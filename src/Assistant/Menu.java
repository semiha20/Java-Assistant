package Assistant;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Menu implements Isaved {
	static String AddEv;
	
	

	void if1() throws IOException {
		
		File addevent= new File("Events.txt");
		FileWriter EW = new FileWriter(addevent,true);
		BufferedWriter BW= new BufferedWriter(EW);
		PrintWriter PW=new PrintWriter(BW);
		Scanner addE= new Scanner(System.in);
		System.out.println("Enter the event");
		AddEv =addE.nextLine();
		PW.print(AddEv+"\n");
		PW.close();
	}
	void if2() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("Events.txt"));
		 String line;
		 while ((line = br.readLine()) != null) {
		   System.out.println(line);
		 }
		
	}
	void if3() throws IOException {
		File addC=new File("Contacts.txt");
		FileWriter CWriter=new FileWriter(addC,true);
		BufferedWriter CB=new BufferedWriter(CWriter);
		PrintWriter Cprint=new PrintWriter(CB);
		Scanner y=new Scanner(System.in);
		System.out.println("Name :\n");
		String Cname=y.nextLine();
		Scanner t=new Scanner(System.in);
		System.out.println("Mail Adress:");
		String CMail=t.nextLine();
		Scanner u=new Scanner(System.in);
		System.out.println("Phone Number");
		String CNumber=u.nextLine();
		
		Cprint.print(Cname);
		Cprint.print(",");
		Cprint.print(CMail);
		Cprint.print(",");
		Cprint.print(CNumber+"\n");
		Cprint.close();
		System.out.println("Contact saved succesfully");
		
	}
	void if4() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("Contacts.txt"));
		 String line;
		 while ((line = br.readLine()) != null) {
		   System.out.println(line);
		 }
	}
	void if5() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("ToDoList.txt"));
	    String line;
	    while ((line = br.readLine()) != null) {
	    System.out.println(line);
}
	}



	void if6() throws IOException {
		File todo=new File("ToDoList.txt");
		FileWriter tdW=new FileWriter(todo,true);
		BufferedWriter tdB=new BufferedWriter(tdW);
		PrintWriter tdPrint=new PrintWriter(tdB);
		Scanner t=new Scanner(System.in);
		System.out.println("Enter your note you want to add in your ToDo List :\n");
		String notes=t.nextLine();
		tdPrint.print(notes+"\n");
		tdPrint.close();

	}
	
	
	public  void ifseven(String filepath, String removeterm, int positionofterm, String delimeter) {
		int position=positionofterm -1;
		String tempFile="temp.txt";
		File oldfile=new File(filepath);
		File newfile=new File(tempFile);
		String currentLine;
		String data[] = null;
		try {
			FileWriter dfw= new FileWriter(tempFile,true);
            BufferedWriter dbw=new BufferedWriter(dfw);
            PrintWriter dp=new PrintWriter(dbw);
            
            FileReader dfr=new FileReader(filepath);
            BufferedReader dbr=new BufferedReader(dfr);
            
          while((currentLine=dbr.readLine())!=null)
          {
        	  data[0]= currentLine ;
        	  if(data[position].split(",").equals((removeterm))) {
        		  dp.println(data);
        		  
        	  }
          }
         
            
            dp.flush();
            dp.close();
            dfw.close();
            dbw.close();
            dbr.close();
            dfr.close();
            
            oldfile.delete();
            File idk=new File(filepath);
            newfile.renameTo(idk);
            
		}catch(Exception e) {
			System.out.println("error");
		}
	}
	
	
		@Override
	
	public void saved() {
    System.out.println("Saved!");		
	}
	
}
