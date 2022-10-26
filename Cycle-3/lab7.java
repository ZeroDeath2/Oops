import java.io.*;
import java.util.*;
class lab7{
	public static void main(String[] args){
		try{
			Writer w=new FileWriter("lab7.txt");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter What to be inputted: ");
			String s=sc.nextLine();
			w.write(s);
			w.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		try{
			Reader r=new FileReader("lab7.txt");
			int ch;
			ch=r.read();
			while(ch!=-1){
				System.out.print((char)ch);
				ch=r.read();
			}
			System.out.println();
			r.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
