/*
 * @(#)WordCount.java $version 2013. 2. 15.
 *
 */

package wordcount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordCount {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		int lineCnt = 0, wordCnt = 0, charCnt = 0;
		
		System.out.println("please input sentences>");
		
		while((line = br.readLine())!=null) {
			lineCnt++;
			wordCnt += countWord(line);
			charCnt += charCnt + line.length();
		}
		
		System.out.println("lineCnt : " + lineCnt);
		System.out.println("wordCnt : " + wordCnt);
		System.out.println("charCnt : " + charCnt);
	}

	/**
	 * @param line
	 * @return
	 */
	private static int countWord(String line) {
		return line.trim().split("\\s+").length;
	}
}
