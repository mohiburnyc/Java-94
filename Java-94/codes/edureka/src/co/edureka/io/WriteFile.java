package co.edureka.io;

import java.io.FileOutputStream;

public class WriteFile {

	public static void main(String[] args) throws Exception {
		//FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt");
		FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt", true); //true - appending mode
		
		String str = "Edureka's online training helps you land the job of your dreams. Enroll now in edureka.co.\n";
		byte[] b = str.getBytes(); //to convert String to byte[]
		
		fout.write(b);
		System.out.println("file saved");
		
		fout.close();
	}

}