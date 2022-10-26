import java.io.*;
import java.util.*;
public class lab8{
	public static void main(String[] args){
		try{
			FileOutputStream w=new FileOutputStream("lab8.txt");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter What to be inputted: ");
			String s=sc.nextLine();
			byte b[]=s.getBytes();
			w.write(b);
			w.close();
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());}
		catch(IOException e){
			System.out.println(e.getMessage());
		
		}
		try{
			FileInputStream r=new FileInputStream("lab8.txt");
			int ch;
			ch=r.read();
			while(ch!=-1){
				System.out.print((char)ch);
				ch=r.read();
			}
			System.out.println();
			r.close();
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}
