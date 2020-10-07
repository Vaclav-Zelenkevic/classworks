package lt.vtmc;

public abstract class Animal {
	private int id;
	private String name;
	private int age;
	public String legNumber;
//	private boolean canFly;
	
	public Animal(int id, String name, int age) {
		setId(id);
		this.name = name;
		this.age = age;
	}

	public abstract void makeSound();
	
//	public void flying();

	public void eat() {
		System.out.println("Animal is eating ...");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id < 0) {
			System.out.println("Bad ID!");
		} else {
			this.id = id;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
//	public boolean isCanFly() {
//		return canFly;
//	}
//
//	public void setCanFly(boolean canFly) {
//		this.canFly = canFly;
//	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
