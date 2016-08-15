package paymentTypes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.*;

public class CandyWriteFile {

	
		Path filePath = Paths.get("CandyData.txt");
		File myCandyFile = filePath.toFile();

	
	

	public static void readFile(File myCandyFile) {
		try {
			FileReader reader = new FileReader(myCandyFile);
			BufferedReader bReader = new BufferedReader(reader);
			String newLine = bReader.readLine();
			while (newLine != null) {
				System.out.println(newLine);
				newLine = bReader.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
		}
	}

	public static void writeToFile(File myCandyFile) {
		PrintWriter wrt = null;
		try {
			wrt = new PrintWriter(myCandyFile);
			wrt.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			wrt.close();
		}
	}
}

