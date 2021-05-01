package ikinciGunOdev;

public class InstructorManager {
	
	public void add(Instructor instructor) {
		System.out.println("Eðitmen eklendi. \n" + instructor.name);
		System.out.println("Eðitmen bilgisi eklendi \n" + instructor.instructorInformation);
		System.out.println("-------------------------------------");
	}
	
	public void getInstructor(Instructor[] instructors) {
		System.out.println("Eðitmenler listelendi.");
		for (Instructor instructor  : instructors) {
			System.out.println(instructor.name + " --> " + instructor.instructorInformation);
		}
	}
}
