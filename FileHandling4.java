import java.io.*;

class FileHandling4{
	public static void main(String [] args) throws IOException{
		BufferedWriter bis = new BufferedWriter(new FileWriter("C:/Prasadjava/name2.txt",true));
		bis.write("Java Lab");
		bis.close();
	}
}