package ikinciGunOdev;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý(C# + ANGULAR)");
		Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý(JAVA + REACT)");
		Course course3 = new Course(1, "Programlamaya Giriþ için Temel Kurs");
		
		Course[] courses = {course1, course2, course3};
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		courseManager.getCourses(courses);
		
		System.out.println("-------------------------------------");
		
		Instructor instructor1 = new Instructor();
		instructor1.id = 1;
		instructor1.name = "Engin Demirog";
		instructor1.instructorInformation = "MCT, PMP, ITIL";
		
		Instructor instructor2 = new Instructor();
		instructor2.id = 2;
		instructor2.name = "Bircan Çiftçi";
		instructor2.instructorInformation = "C#, Java";
		
		Instructor[] instructors = {instructor1, instructor2};
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.add(instructor2);
		instructorManager.getInstructor(instructors);
		
	}

}
