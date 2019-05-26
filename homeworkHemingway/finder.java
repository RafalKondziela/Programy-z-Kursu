package homeworkHemingway;


public class finder {

	
	
	public static int countWords(String text) {
		
		while(true) {
			
			String[] counter = text.split("\\s+");
					return counter.length;
		}
		
	}
	
	public static int countSpecifiedWord(String text, String word) {
		
		text = text.toLowerCase();
		
		
		int counter = 0;
		int index = text.indexOf(word);
		while (index != -1) {
		    counter++;
		    index = text.indexOf(word, index+1);
		}
		
		return counter ;
	}
	
	public static int countLastTwoLetters(String text, String letters) {
		
		
		int counter = 0;
		int index = text.lastIndexOf(letters);
				while (index != -1) {
				    counter++;
				    index = text.indexOf(letters, index+1);
				}
		
		return counter;
	}
}
