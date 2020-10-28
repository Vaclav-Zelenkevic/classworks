package lt.vtmc.javaserialization;

import java.io.Serializable;

public class Person implements Serializable{
	private static final long serialVersionUID = 3246573416474L;
	private transient int id; // not serializable 
	private String name;
	private String surname;
	private int age;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
}
