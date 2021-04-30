
public class UserManager {

	public void add(User user) {
		System.out.println(user.getName() +" "+ user.getLastName() + " kaydedildi.");
	}
	
	public void addMultiple(User[] users) {
		for(User user : users) {
			add(user);
		}
	}
	public void logIn() {
		System.out.println("Giris Yap�ld�.");
	}
	public void logOut() {
		System.out.println("��k�s Yap�ld�.");
	}
	
	
}
