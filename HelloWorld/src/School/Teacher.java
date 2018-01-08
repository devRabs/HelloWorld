package School;

public class Teacher {

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	private String name;
	private String subject;
	
	public String toString()
	{
		return "Teacher name : "+name +" Subject : "+ subject;
	}
	
}
