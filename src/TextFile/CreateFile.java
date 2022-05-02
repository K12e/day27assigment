package TextFile;

import java.io.File;

public class CreateFile {
	public static void main(String[] args) {
		final String fileName="file.txt";
		try {
			File objFile = new File(fileName);
			if(objFile.createNewFile()) {
				System.out.println("file created successefully");
			}
		}
		catch(Exception e) {
			System.out.println("exception "+e.toString());
		}
	}
		}
