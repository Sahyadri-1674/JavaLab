import java.io.*;

class FileHandling5{
	public static void main(String [] args) throws IOException{
		int ch;
        BufferedReader br = new BufferedReader(new FileReader("C:/Prasadjava/name2.txt"));
        while((ch=br.read())!=-1){
            System.out.print((char)ch);
		}
        br.close();		
	}
}
