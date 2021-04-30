
public class InstructorManager extends UserManager{
	
	public void add(User user) {
		System.out.println(user.getName()+" " + user.getLastName()+ " e�itmen olarak eklendi.");
	}
	public void delete(User user) {
		System.out.println(user.getId() + " ID'li ��renci silindi.");
	}
	
	public void addCourse(Course course) {
		System.out.println(course.name +" "+ "Kursu Eklendi. E�itmen: " + course.instructor);
	}
}
