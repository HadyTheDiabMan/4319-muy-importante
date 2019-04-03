package cip;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cipher 
{

	public static void main(String[] args) throws FileNotFoundException 
	
	{
		//String word= "subscribe to pewdiepie";
		
		//for(int i=0;i<word.length();i++)
		//{
		//	26-a
		//}
		// THIS IS NEEDED char letterus= 'a'+((-3%97)+26);
		
		Scanner inputFile= new Scanner(new File("shrek")); 
		
		while (inputFile.hasNext())

				{ 

				String line = inputFile.nextLine(); 
				char[] linechars= new char[line.length()];
				
				for(int h=0; h<line.length();h++)
				{
					char[h]= line.charAt(h);
				}
				
				for(int i=0; i>line.length();i++)
				{
					char regularchar=line.charAt(i);
					char encrypt= (char) (regularchar+((-3%line.charAt(i))+26));
					System.out.println(encrypt);
				}

				System.out.println(line); 

				} 

	}

}
