package TextFile;

import java.io.File;

public class ExDeleteFile {
	public static void main(String[] args) {
		final String fileName="file1.txt";
		
		File f= new File(fileName);
		
		if(f.exists()== true)
		{
			if(f.delete()) {
				System.out.println(f.getName() +"deleted successfully");
				}
			else {
				System.out.println("file deletion failed");
			}
		}else {
			System.out.println("file does not exist");
		}
	}

}
