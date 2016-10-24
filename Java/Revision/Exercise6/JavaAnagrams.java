package Exercise6;


import java.util.Arrays;

public class JavaAnagrams {

	
	public static void main(String[] args) {

		//This part of code will test your execution (Don't touch this part of code)
		//Test Case 1
		System.out.println("Input Testing: anargram and margana");
		System.out.println("Expercted output: Anagrams");
		if (isAnagram("anagram", "margana") ) 
			System.out.println("Your output: Anagrams");
		else
			System.out.println("Your output: Not Anagrams");
		
		//Test Case 2
		System.out.println("\nInput Testing: anagramm and marganaa");
		System.out.println("Expercted output: Not Anagrams");
		if (isAnagram("anagramm", "marganaa") ) 
			System.out.println("Your output: Anagrams");
		else
			System.out.println("Your output: Not Anagrams");
		
		//Test Case 3
		System.out.println("\nInput Testing: Hello and hello");
		System.out.println("Expercted output: Anagrams");
		if (isAnagram("Hello", "hello") ) 
			System.out.println("Your output: Anagrams");
		else
			System.out.println("Your output: Not Anagrams");
	}
	
	public static boolean isAnagram(String a, String b) {
			char [] chars = new char[a.length()];
			char[] chars2 = new char[b.length()];
			if(a.length() != b.length()){
				return false;
			}else{
				for(int i=0; i < a.length(); i++){
					chars[i] = a.toLowerCase().charAt(i);
					chars2[i] = b.toLowerCase().charAt(i);
				}
				
				Arrays.sort(chars);
				Arrays.sort(chars2);
				for(int i=0; i<chars.length; i++){
					if(chars[i] != chars2[i]){
						return false;
					}
				}
				
				return true;
			}
			
		
	}
}
