package persnalJavaPrj;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileContentModification {
	public static void main(String[] args) {
		//파일 읽기
		String fileName = "resource\\자바 번외 - 파일 내용 수정2.txt";
		File inputFile = new File(fileName);
		String line;
		try {
			FileInputStream fileInputStream = new FileInputStream(inputFile);
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
			try {
				//한 줄씩 출력
				while ((line = bufferedReader.readLine()) != null) {
					System.out.println(line);
				}
			} catch (IOException ex2) {
				ex2.printStackTrace();
			}
		} catch (FileNotFoundException ex1) {
			ex1.printStackTrace();
		}
		
		
	}

}
