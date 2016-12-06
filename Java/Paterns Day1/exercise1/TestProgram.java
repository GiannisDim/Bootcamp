package exercise1;



public class TestProgram {

	public static void main(String[] args){
		Student student = new Student();
		Instructor instructor = new Instructor();
		Organizer organizer = new Organizer();
		
		Course course = new Course();
		course.addObserver(student);
		course.addObserver(instructor);
		course.addObserver(organizer);
		
		course.changeTime("12:50", "15:45");
		
	}
}
