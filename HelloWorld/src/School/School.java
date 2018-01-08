package School;

import java.util.Map;

public class School {
	
	public Map<Integer, Student> getStudentMap() {
		return studentMap;
	}

	public void setStudentMap(Map<Integer, Student> studentMap) {
		this.studentMap = studentMap;
	}

	public Map<Integer, Teacher> getTeacherMap() {
		return teacherMap;
	}

	public void setTeacherMap(Map<Integer, Teacher> teacherMap) {
		this.teacherMap = teacherMap;
	}

	private Map<Integer,Student> studentMap;
	private Map<Integer,Teacher> teacherMap;
	
	
	private School(Map<Integer,Student> studentMap,Map<Integer,Teacher> teacherMap)
	{
		this.studentMap=studentMap;
		this.teacherMap=teacherMap;
	}

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

}
