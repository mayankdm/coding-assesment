package java.training.assesments.question2;

public class Author {

	private String authorId;
	private String authorName;
	private String gender;
	private Integer age;

	public Author() {
		super();
	}

	public Author(String authorName, String gender, Integer age) {
		super();
		this.authorName = authorName;
		this.gender = gender;
		this.age = age;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAuthorId() {
		return authorId;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + ", gender=" + gender + ", age=" + age
				+ "]";
	}
}
