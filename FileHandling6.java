import java.io.*;

class FileHandling6{
	public static void main(String [] args) throws IOException{
		String s;
        BufferedReader br = new BufferedReader(new FileReader("C:/Prasadjava/name2.txt"));
        while((s=br.readLine())!=null){
            System.out.print(s);
		}
        br.close();		
	}
}
