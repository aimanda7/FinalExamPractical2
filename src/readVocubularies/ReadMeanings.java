package readVocubularies;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadMeanings {

	public static void doesFileExist(String path)  {

		
		try {
			BufferedReader bufreader = new BufferedReader(new FileReader(path));
			String sentence;
			while ((sentence = bufreader.readLine()) != null) {			
				String[] words = sentence.split("-|,");
				for (String word : words) {
					System.out.println(word);
				}
			}
			bufreader.close();
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		} catch (IOException e) {	
			e.printStackTrace();
		}
		

	}

	public static void main(String[] args) throws IOException {

		String filePath = "src\\readVocubularies\\MyVocabularies.txt";

		doesFileExist(filePath);
	}
}