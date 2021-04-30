
public class StudentManager extends UserManager{

	public void add(User user) {
		System.out.println (user.getId() +" "+ user.getName() +" "+ user.getLastName() + " öğrenci olarak kaydedildi.");
	}
}
