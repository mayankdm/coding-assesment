package java.training.assesments.question5;

import javax.persistence.Entity;

@Entity
public class Guest {
	private String guestId;
	private String name;
	private String city;
	private int age;

	public Guest() {
		super();
	}

	public Guest(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getGuestId() {
		return guestId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGuestId(String i) {
		this.guestId = i;
	}

}
