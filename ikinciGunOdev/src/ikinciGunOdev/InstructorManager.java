package ikinciGunOdev;

public class InstructorManager {
	
	public void add(Instructor instructor) {
		System.out.println("E�itmen eklendi. \n" + instructor.name);
		System.out.println("E�itmen bilgisi eklendi \n" + instructor.instructorInformation);
		System.out.println("-------------------------------------");
	}
	
	public void getInstructor(Instructor[] instructors) {
		System.out.println("E�itmenler listelendi.");
		for (Instructor instructor  : instructors) {
			System.out.println(instructor.name + " --> " + instructor.instructorInformation);
		}
	}
}
