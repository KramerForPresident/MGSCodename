import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CodenameGenerator {

	public static  String getCodename() throws IOException {
		String fullName = "";
		//create two arraylists
		ArrayList<String> pre = new ArrayList<>();
		ArrayList<String> name = new ArrayList<>();
		

		// read in first file
		FileReader in = new FileReader("adj.txt");
		BufferedReader br = new BufferedReader(in);
		
		//store each word in a list
		String line;
		while ((line = br.readLine()) != null) {
			line = line.toUpperCase();
		    pre.add(line);
		}
		
		
		//read in second file
		FileReader inB = new FileReader("animal.txt");
		BufferedReader brB = new BufferedReader(inB);
		
		//store those words in a second list
		while((line = brB.readLine())!= null){
			line = line.toUpperCase();
			name.add(line);
		}
		
		
		/* Prints out both full arraylists. not needed, just here for testing
		for(int i = 0; i < pre.size(); i++){
			System.out.println(pre.get(i));
		}
		System.out.println("\n\n\n\nActual Names");
		for(int i = 0; i < name.size(); i++){
			System.out.println(name.get(i));
		}
		*/
		
	
		
		//generate random indexes for both arraylists
		int randPre = (int)Math.floor(Math.random()*pre.size());
		int randName = (int)Math.floor(Math.random()*pre.size());
		
		//concatenate the full name from two randomly generated words
		fullName = pre.get(randPre) + "" + name.get(randName);
		return fullName;
	}

	
	public static void main(String[] args) throws IOException{
	//	System.out.println(System.getProperty("adj.txt"));
		String t;
		t = getCodename();
		
		System.out.println(t);

	}
		


}
