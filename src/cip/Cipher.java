package cip;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cipher 
{

	public static void main(String[] args) throws IOException 
	
	{
		//String word= "subscribe to pewdiepie";
		
		//for(int i=0;i<word.length();i++)
		//{
		//	26-a
		//}
		// THIS IS NEEDED char letterus= 'a'+((-3%97)+26);
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter a file to encrypt: ");
		String filed= scan.nextLine();
		
		
		Scanner inputFile= new Scanner(new File(filed)); 
		
		String partOfFile= filed.substring(0, filed.length()-4);
		PrintWriter outputfile= new PrintWriter(partOfFile+"_ENC.txt");
		
		
		while (inputFile.hasNext())

			
				{ 

				String line = inputFile.nextLine(); 
				char[] linechars= new char[line.length()];
				
				for(int h=0; h<line.length();h++)
				{
					linechars[h]= line.charAt(h);
				}
				
				for(int i=0; i<line.length();i++)
				{
					
					char regularchar=linechars[i];
					char encrypt= (char) (regularchar+((-3%regularchar)));
					if(regularchar==97)
					{
						encrypt='x';
					}
					if(regularchar==98)
					{
						encrypt='y';
					}
					if(regularchar==99)
					{
						encrypt='z';
					}
					if(regularchar==65)
					{
						encrypt='X';
					}
					if(regularchar==66)
					{
						encrypt='Y';
					}
					if(regularchar==67)
					{
						encrypt='Z';
					}
					if(encrypt<65)
					{
						encrypt=regularchar;
					}
					if(encrypt>122 && encrypt<97&&encrypt>90)
					{
						encrypt=regularchar;
					}
					
					
					System.out.print(encrypt);
				}
				System.out.print("\n");
				 

				} 
			inputFile.close();
			
		
		
		System.out.println();

	}

}
