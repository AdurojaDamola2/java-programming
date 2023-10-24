package psvm_code;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile {
	public static void main (String[] args) throws Exception {
		BufferedReader bufferReader = new BufferedReader (new FileReader ("C:\\Users\\Aduroja Damola\\Documents\\info.txt"));
		String line;
		if ((line = bufferReader.readLine ()) != null) {
			System.out.println (line);
		} else {
			throw new Exception ("file is empty");
			
			
		}
	}
	
}