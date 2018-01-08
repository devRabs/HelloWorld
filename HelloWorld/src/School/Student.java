package School;

public class Student {
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	private String name;
	private Integer roll;
	
	public String toString()
	{
		return "Student name : "+name +" Roll : "+ roll;
	}

}
