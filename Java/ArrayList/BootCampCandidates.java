

public class BootCampCandidates {
	
	//Create three private fields a name a surname and age
	private String name;
	private String surname;
	private int age;
	
	//Create a constructor that receives three arguments and initializes the variables
	BootCampCandidates(String name, String surname, int age){
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	//Create getters and setters for all your variables (six in total methods needed)
	public String getName(){return this.name;}
	public void  setName(String name){this.name = name;}
	public String getSurname(){ return this.surname;}
	public void setSurname(String surname){this.surname = surname;}
	public int getAge(){ return this.age;}
	public void setAge(int age){this.age = age;}
	
	//Create a method toString that returns the name surname and age of the candidate
	public String toString(){
		return "Name: "+this.getName()+"| Surname: "+this.getSurname()+"| Age: "+this.getAge();
	}

}
