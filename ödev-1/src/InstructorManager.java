
public class InstructorManager extends UserManager{
	
	public void add(User user) {
		System.out.println(user.getName()+" " + user.getLastName()+ " eðitmen olarak eklendi.");
	}
	public void delete(User user) {
		System.out.println(user.getId() + " ID'li Öðrenci silindi.");
	}
	
	public void addCourse(Course course) {
		System.out.println(course.name +" "+ "Kursu Eklendi. Eðitmen: " + course.instructor);
	}
}
