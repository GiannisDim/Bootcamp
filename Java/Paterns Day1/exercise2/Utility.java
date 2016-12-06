package exercise2;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Utility {

	public static String readFile(String filePath){
		StringBuilder sb = new StringBuilder();
		try{
			
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			String line;
			while((line = reader.readLine()) != null){
				sb.append(line + "\n");
			}
			reader.close();
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sb.toString();	
	}
	
	public static void writeFile(String text, String filePath){
		BufferedWriter writer = null;
		try{
			writer = new BufferedWriter(new FileWriter(filePath));
			writer.write(text);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				writer.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
