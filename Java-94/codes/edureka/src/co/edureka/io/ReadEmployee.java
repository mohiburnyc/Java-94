package co.edureka.io;

import java.io.File;
import java.util.Scanner;

public class ReadEmployee {

	public static void main(String[] args) throws Exception {
		File file = new File("src/co/edureka/io/emp.txt"); 
		
		if(file.exists()) {
			Scanner sc = new Scanner(file);			
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				Scanner sc1 = new Scanner(line);
				sc1.useDelimiter(",");
				
				System.out.println(sc1.nextInt()+ " | " + sc1.next() + " | "+sc1.nextFloat());
				/*
				String line = sc.nextLine();
				String[] words = line.split(",");
				System.out.println(words[0] + " | " + words[1] + " | "+ words[2]);
				*/
				Thread.sleep(2000);
				
			}
			sc.close();
		}
	}

}
