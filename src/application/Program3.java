package application;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Program3 {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		String path = "c:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { // with true will add to file if this already exists
			for (String line : lines) {
				bw.write(line);
				bw.newLine(); // to break line
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
