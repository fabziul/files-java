package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise {

	public static void main(String[] args) {
		
		String in = "c:\\temp\\in\\source.csv";
		String out = "c:\\temp\\out\\summary.csv";
		String[] infoIn;
		String lineOut;
		
		try (BufferedReader br = new BufferedReader(new FileReader(in))) {
			String line = br.readLine();
			while (line != null) {
				infoIn = (line.split(","));
				lineOut = (infoIn[0]+", "+Double.parseDouble(infoIn[1])*Integer.parseInt(infoIn[2]));
				try (BufferedWriter writeFile = new BufferedWriter(new FileWriter(out, true))){
					writeFile.write(lineOut);
					writeFile.newLine();
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(lineOut);
				line = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
		

	}

}
