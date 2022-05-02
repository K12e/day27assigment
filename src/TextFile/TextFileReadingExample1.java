package TextFile;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReadingExample1 {
	public static void main(String[] args)  {
		try {
		FileReader reader =new  FileReader("MyText.txt");
		boolean characters;
		
		while(characters=reader.read() !=-1){
		char character = 0;
		System.out.println((char) character);	
		}
		reader.close();
		}catch(IOException e)
		{
			e.printStackTrace();
			
		}
	}

}
