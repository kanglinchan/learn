package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class fileExeception{
	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\60116\\Documents\\fd.txt");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		try {
//			FileInputStream fis = new FileInputStream(f);
//			Date d = sdf.parse("2018-08-241");
//			System.out.print("succee");
//			System.out.print(d);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//			System.out.println("fail");
//		}catch (ParseException e1) {
//			e1.printStackTrace();
//			System.out.println("parse fail");
//		}
		
//		try {
//			FileInputStream fis = new FileInputStream(f);
//			Date d = sdf.parse("2018-08-241");
//			System.out.println("succee");
//			System.out.println(d);
//		} catch (FileNotFoundException |ParseException e) {
//			if (e instanceof FileNotFoundException) {
//				System.out.println("file fail");
//			}
//			if (e instanceof ParseException) {
//				System.out.println("parse fail");
//			}
//		} finally {
//			System.out.println("however");
//		}
		
		
		catchException();
			
		
	}
	
	private static void catchException() {
		try {
			readFile();
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("read fail");
		}
	}
	
	private static void readFile() throws FileNotFoundException {
		File f = new File("f://dd.js");
		FileInputStream fis = new FileInputStream(f);
	}
}