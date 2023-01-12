package java.training.assesments.question4;

public class Candidate {
	private String name;
	private Integer age;
	private String Education;

	public Candidate() {
		super();
	}

	public Candidate(String name, Integer age, String education) {
		super();
		this.name = name;
		this.age = age;
		Education = education;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEducation() {
		return Education;
	}

	public void setEducation(String education) {
		Education = education;
	}

	static void validateAge(int age) throws AgeException {
		if (age < 21) {
			throw new AgeException("Under age!");
		} 
		if(age > 60) {
			throw new AgeException("Over age!");
		}
		else {
			System.out.println("Age matches");
		}
	}
	static void validateEducation(String edu) throws EduException {
		if (edu.equalsIgnoreCase("Btech")) {
			throw new EduException("Sorry! Invalid Education!");
		} 
		else {
			System.out.println("Education Matches!");
		}
	}

}
