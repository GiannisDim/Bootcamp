package exercise3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Metrics {

	public static String readFile(String filePath){
		StringBuilder sb = new StringBuilder();
		try{
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			String line;
			while((line = reader.readLine()) != null){
				sb.append(line + System.lineSeparator());
			}
			reader.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();	
	}

	public static void countLines(String filename){
		Pattern patt = Pattern.compile("(?m)^.*\\S+.*$");
		Matcher m = patt.matcher(filename);
		int count = 0;
		while(m.find()){
			count++;
		}
		
		System.out.println("Lines of code: "+count);
	}

	public static void countClass(String filename){
		Pattern patt = Pattern.compile("class\\s[A-Z]");
		Matcher m = patt.matcher(filename);
		int count = 0;
		while(m.find()){
			count ++;
		}
		System.out.println("Classes :"+count);
	}
	
	public static void countMethods(String filename){
		Pattern patt = Pattern.compile("(public|private|protected)\\s+.+\\(.*\\).");
		Matcher m = patt.matcher(filename);
		
		int count = 0 ;
		while(m.find()){
			count++ ;
		}
		System.out.println("Methods: "+count);
	}
}
