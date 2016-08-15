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

	/**/

	public static void main(String[] args) {
		Path filePath = Paths.get("CandyData.txt");
		File myCandyFile = filePath.toFile();
		writeToFileAppend(myCandyFile);
		readFile(myCandyFile);
	}

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
			wrt.println("Hello World!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			wrt.close();
		}
	}

	public static void writeToFileAppend(File myCandyFile) {
		FileWriter wrt = null;
		try {
			wrt = new FileWriter(myCandyFile, true);
			wrt.append("Hello World!");
			wrt.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

		}
	}
}

/*
 * public static void main(String[] args) {
 * 
 * Path filePath = Paths.get("CandyData.txt"); File myCandyFile =
 * filePath.toFile(); writeToFile(myCandyFile); writeToFileAppend(myCandyFile);
 * readFile(myCandyFile); }
 * 
 * public static void readFile(File myCandyFile) { // reader reads one character
 * at a time. User a wrapper opject to do. // use BufferedReader // in this case
 * to wrap reader. this is called COMPOSITION. try { FileReader reader = new
 * FileReader(myCandyFile); BufferedReader bReader = new BufferedReader(reader);
 * // read the first line String newLine = bReader.readLine(); // this reads
 * only one line // then goes to the next // one. if you want to read //
 * multiple lines, need a loop. the last line needs to be null. // is the line
 * null? if not, program will fetch another one. while (newLine != null) {
 * System.out.println(newLine); newLine = bReader.readLine(); } } catch
 * (FileNotFoundException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); } catch (IOException e) { } }
 * 
 * // now let's write to the file: public static void writeToFile(File
 * myCandyFile) { PrintWriter wrt = null; // now we know where the file is and
 * how to get information for that // file
 * 
 * // now, to write data to that file: // use Eclipse to put a try-catch around
 * the statement instead of doing // a "throws" in the main method // so that
 * the main method does not fail and crash the whole program try { wrt = new
 * PrintWriter(myCandyFile); wrt.println("Hello World!"); } catch
 * (FileNotFoundException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); } finally { wrt.close(); } }
 * 
 * public static void writeToFileAppend(File myCandyFile) { FileWriter wrt =
 * null; // now we know where the file is and how to get information for that //
 * file
 * 
 * // now, to write data to that file: // use Eclipse to put a try-catch around
 * the statement instead of doing // a "throws" in the main method // so that
 * the main method does not fail and crash the whole program try { wrt = new
 * FileWriter(myCandyFile, true); // true is needed to // enable the FileWriter
 * wrt.append("Hello World!"); } catch (FileNotFoundException e) {
 * e.printStackTrace();
 * 
 * } catch (IOException e) { } }}
 */
