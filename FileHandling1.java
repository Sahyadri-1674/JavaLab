import java.util.*;
import java.io.*;
class FileHandling1 {
	public static void main(String args []) throws IOException{
		File f = new File("C:/Prasadjava/name1.txt");//Mention the path of the current directory
		f.createNewFile();  //method to create a file 
	    System.out.println("Is exists :"+ f.exists());
		System.out.println("Can Write in File: "+ f.canWrite());
		System.out.println("File name : "+ f.getName());
		System.out.println("File length is "+ f.length());
		//f.delete(); //Inorder to delete the file
	}
}