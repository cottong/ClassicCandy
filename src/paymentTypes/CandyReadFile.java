package paymentTypes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.*;

public class CandyReadFile {

	public static void main(String[] args) {

		Path filePath = Paths.get("CandyData.txt");
		File myCandyFile = filePath.toFile();
		writeToFile(myCandyFile);
		readFile(myCandyFile);
	}

	// create readFile method. reader only reads one character at a time. User a
	// wrapper object to do.
	// use BufferedReader to wrap reader. this is called COMPOSITION.
	public static void readFile(File myCandyFile) {

		FileReader reader;
		try {
			reader = new FileReader(myCandyFile);
			BufferedReader bReader = new BufferedReader(reader);
			// read the first line
			String newLine = bReader.readLine();
			// need a loop here to read multiple lines. the last line needs to be null.
			// if the line is not null, the program will fetch another one.
			while (newLine != null) {
				System.out.println(newLine);
				newLine = bReader.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// create writeToFile method:
	public static void writeToFile(File myCandyFile) {
		PrintWriter writer = null;
		// now we know where the file is and how to get information for that
		// file

		// now, to write data to that file:
		// use Eclipse to put a try-catch around the statement instead of doing
		// a "throws" in the main method
		// so that the main method does not fail and crash the whole program
		try {
			writer = new PrintWriter(myCandyFile);
			// need scanner input here?
			writer.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			writer.close();
		}
	}

	/*public static void writeToFileAppend(File myCandyFile) {
		FileWriter wrt = null;
		// now we know where the file is and how to get information for that
		// file

		// now, to write data to that file:
		// use Eclipse to put a try-catch around the statement instead of doing
		// a "throws" in the main method
		// so that the main method does not fail and crash the whole program
		try {
			wrt = new FileWriter(myCandyFile, true); // true is needed to enable FileWriter
			// need scanner input here?
			wrt.append("Hello World!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
		}
	}*/
}
