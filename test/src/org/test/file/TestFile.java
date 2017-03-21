/**
 * 
 */
package org.test.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author huzhe
 *
 */
public class TestFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "/Users/huzhe/Downloads/PASAUCH_20150605_005.AM";

		FileWriter fw = null;
		try {
			fw = new FileWriter("/Users/huzhe/Downloads/new.txt");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		BufferedWriter bw = new BufferedWriter(fw);
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		br = new BufferedReader(fr);
		String str = null;
		try {
			while (null != (str = br.readLine())) {
				System.out.println(str);
				bw.write(str+"\r\n");
				bw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
				br.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
