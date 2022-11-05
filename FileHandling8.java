import java.io.*;

class FileHandling8{
	public static void main(String [] args) throws IOException{
		int ch;
        BufferedReader br = new BufferedReader(new FileReader("C:/Prasadjava/name2.txt"));
        FileOutputStream fout = new FileOutputStream("C:/Prasadjava/name1.txt",true);//If the doesn't exists it will create it

        while((ch=br.read())!=-1){
		    fout.write((char)ch);
            System.out.print((char)ch);
		}
        br.close();	
        fout.close();		
	}
}
