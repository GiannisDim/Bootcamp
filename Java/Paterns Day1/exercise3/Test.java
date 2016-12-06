package exercise3;

public class Test {

	public static void main(String[] args){
		Metrics.countLines(Metrics.readFile("./src/exercise3/Metrics.java"));
		Metrics.countClass(Metrics.readFile("./src/exercise3/Metrics.java"));
		Metrics.countMethods(Metrics.readFile("./src/exercise3/Metrics.java"));
		
	}
}
