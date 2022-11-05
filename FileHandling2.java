import java.io.*;
import java.util.*;

class FileHandling2{
	public static void main(String [] args) throws IOException{
		int i;
		FileOutputStream fout = new FileOutputStream("C:/Prasadjava/name1.txt",true);  //If the doesn't exists it will create it
		String s = "Prasad Arote";
		char ch[] = s.toCharArray();  //Converts string into character Array.
		for(i=0;i<s.length();i++)
			fout.write(ch[i]);
		fout.close();
	}
}
