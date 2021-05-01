package ikinciGunOdev;


public class CourseManager {
	
	public void add(Course course) {
		System.out.println("Yeni kurs eklendi. \n" + course.name);
		System.out.println("-------------------------------------");
	}
	
	public void getCourses(Course[] courses) {
		System.out.println("Kurslar listelendi.");
		for (Course course : courses) {
			System.out.println(course.name);
		}
	}
}
