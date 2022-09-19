import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MostUsedWords {
	public static void main(String[] args) throws Exception{
		
		ArrayList<String> usedWords = new ArrayList<String>();
		String line, words="";
		int counter = 0;
		int max = 0;
		
		FileReader fr = new FileReader("/Users/remycloud/Documents/CEN4333C/Module2File.html");
		Scanner scan = new Scanner(fr); 
		
		while((line = scan.nextLine()) != null) {
			usedWords.add(words);
		}
		
		for(int i = 0; i<usedWords.size(); i++) {
			counter++;
			
			for(int j=i+1; j<usedWords.size(); j++) {
				if(usedWords.get(i)==usedWords.get(j)) {
					counter++;
				}
			}
			
			if(counter>max) {
				max=counter;
				words=usedWords.get(i);
			}
		}
		
		System.out.println(words+", "+max);
		scan.close();
	}
	
}