package fichier;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileTest {

	public static void main(String[] args) {

		ArrayList<String> allFiles = new ArrayList<String>();
		parcoursRep(new File("C:\\"), allFiles);
	
	}

	public static void parcoursRep(File path, List<String> allFiles) {
		if (path.isDirectory()) {
			File[] list = path.listFiles();
			if (list != null) {
				for (int i = 0; i < list.length; i++) {
					
					parcoursRep(list[i], allFiles);
				}
			} 
		} else {
			String currentFilePath = path.getAbsolutePath();
			System.out.println(currentFilePath);
			allFiles.add(currentFilePath);
		}
	}
}