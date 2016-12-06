package exercise2;

public class Test {
	
	public static void main(String args[]){
		Utility.writeFile("Hello World","maze1.txt");
		System.out.println(Utility.readFile("maze1.txt"));
		Utility.writeFile("Changed file", "maze1.txt");
		System.out.println(Utility.readFile("maze1.txt"));
	}
}
