package interviewQustions;

public class SplitString {

	public static void main(String[] args) {
		String words="Hello Bhuvi are working in IT";
		String word[]=words.split("\\s");
		
		for(String w :word) {
		System.out.println(w);
		}
	}

}
