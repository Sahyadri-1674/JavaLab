import java.io.*;

class FileHandling3{
	public static void main(String [] args) throws IOException{
		int i;
		FileInputStream fin = new FileInputStream("C:/Prasadjava/name1.txt");
		do
		{
			i=fin.read();
			if(i!=-1)
			System.out.print((char)i);
		}while(i!=-1);
	}
}
	