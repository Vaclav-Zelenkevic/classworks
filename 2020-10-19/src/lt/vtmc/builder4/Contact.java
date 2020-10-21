package lt.vtmc.builder4;

public class Contact {
	private String name;
	private String surname;
	private String email;
	private String phone;
	
	public Contact(String name, String surname, String email, String phone) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phone = phone;
	}
	
	public Contact(String name, String surname, String phone) {
		this.name = name;
		this.surname = surname;
		this.phone = phone;
	}
	
	public Contact(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", surname=" + surname + ", email=" + email + ", phone=" + phone + "]";
	}
	
}
