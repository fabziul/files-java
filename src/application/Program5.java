package application;

import java.io.File;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// File informations
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: "+path.getName());
		System.out.println("getParent: "+path.getParent());
		System.out.println("getPath: "+path.getPath());
		System.out.println("getTotalSpace: "+path.getTotalSpace());
		
		sc.close();
	}

}
