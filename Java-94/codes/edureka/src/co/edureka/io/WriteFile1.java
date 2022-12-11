package co.edureka.io;

import java.io.FileWriter;

public class WriteFile1 {

	public static void main(String[] args) throws Exception {
		FileWriter fout = new FileWriter("src/co/edureka/io/edureka1.txt");
				
		String str = "Edureka's online training helps you land the job of your dreams. Enroll now in edureka.co.\n";
				
		fout.write(str);
		System.out.println("file saved");
		
		fout.close();

	}

}
