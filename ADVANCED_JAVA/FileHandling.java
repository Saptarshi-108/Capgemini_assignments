package com;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main{
	public static void main(String[] args) throws IOException{
		
		File file = new File("D:\\My Nuclear Codes\\IEM");
		System.out.println(file.exists());
		file.mkdir();
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
		String[] listofFolder = file.list();
		int count =0;
		for (String fileFolderName : listofFolder) {
			System.out.println(fileFolderName);
			count++;
		}
		System.out.println("Total Files :"+count);
		File file1 = new File(file,"demo.txt");
		try {
			file1.createNewFile();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		FileWriter filewriter = new FileWriter("demo.txt");
		filewriter.write(97);
		filewriter.write("My name is Dinga");
		char[] c = {'a','b','c'};
		filewriter.write(c);
		filewriter.flush();
		filewriter.close();
		
// File reader is the class which is used to read the data from the files.
		
		FileReader filereader = new FileReader("D:\\My Nuclear Codes\\IEM\\demo.txt");
		int i = filereader.read();
		System.out.println(i);
		/*read method is used to read the data in the form of char and return the data.*/
		while (i!=-1) {
			System.out.println((char) i);
			i=filereader.read();	
		}
		
		FileWriter writer  = new FileWriter("demo.txt",true);
		BufferedWriter buffer = new BufferedWriter(writer);
		buffer.write(100);
		buffer.newLine();
		buffer.write("My name is Mamata");
		buffer.newLine();
		char[] a = {'a','b','c'};
		buffer.write(a);
		
		buffer.flush();
		buffer.close();
		FileReader filereader = new FileReader("demo.txt");
		int i = filereader.read();
		System.out.println(i);
		/*read method is used to read the data in the form of char and return the data.*/
		while (i!=-1) {
			System.out.println((char) i);
			i=filereader.read();	
		}
		
		FileReader reader  = new FileReader("demo.txt");
		BufferedReader bufferRead = new BufferedReader(reader);
		String line = bufferRead.readLine();
		while (line!=null) {
			System.out.println(line);
			line= bufferRead.readLine();
		}
		
		FileWriter writer = new FileWriter("demo.txt",true);
		PrintWriter printWriter = new PrintWriter(writer);
		
		printWriter.println("My name is Raju");
		printWriter.println('M');
		printWriter.println(25);
		printWriter.println(true);
		printWriter.println(100);
		
		printWriter.flush();
		printWriter.close();
		
	}
}
