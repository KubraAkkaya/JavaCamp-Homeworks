
public class Main {

	public static void main(String[] args) {
		UserManager userManager=new UserManager();
		userManager.logIn();
		
		Student student1=new Student();
		student1.setName("Kübra");
		student1.setLastName("Akkaya");
		student1.setEmail("kübra@gmail.com");
		student1.setPassword("123abc");
		student1.setId(1);
		
		Student student2=new Student();
		student2.setId(2);
		student2.setName("Elif");
		student2.setLastName("Akkaya");
		student2.setEmail("Elif@gmail.com");
		student2.setPassword("abc123");
		
		
		
		Instructor instructor1=new Instructor();
		instructor1.setName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setEmail("Engin@gmail.com");
		instructor1.setPassword("123456");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.add(student2);
		
		Course course1 = new Course("C#", "Engin Demiroğ");
		Course course2 = new Course("Java", "Engin Demiroğ");
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.delete(student1);
		instructorManager.addCourse(course2);
		instructorManager.addCourse(course1);

		
		UserManager userManager2=new UserManager();
		userManager2.logOut();
		
		
		
	}

}
