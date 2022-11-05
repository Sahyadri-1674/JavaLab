import java.io.*;

class FileHandling7{
	public static void main(String [] args) throws IOException{
		char cg[] = new char[50];
        BufferedReader br = new BufferedReader(new FileReader("C:/Prasadjava/name2.txt"));
            br.read(cg,0,50);
            System.out.print(cg);
		
        br.close();		
	}
}
