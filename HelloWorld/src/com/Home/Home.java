/**
 * 
 */
package com.Home;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import School.School;
import School.Student;
import School.Teacher;

/**
 * @author rupak & nupur
 *
 */
public class Home {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Second commit
		
		// TODO Auto-generated method stub
			Student student1 = new Student();
			student1.setRoll(1);
			student1.setRoll(1);
			student1.setName("Abc");
			
			Student student2 = new Student();
			student2.setRoll(2);
			student2.setName("XYZ");;
			
			Teacher teacher1 =  new Teacher();
			teacher1.setName("t1");
			teacher1.setSubject("Math");
			
			Teacher teacher2 = new Teacher();
			teacher2.setName("t2");
			teacher2.setSubject("Science");
			
			School school1 = new School();
			
			Map<Integer,Student> studentMap = new HashMap<Integer,Student>();
			studentMap.put(1, student1);
			studentMap.put(2, student2);
			
			Map<Integer,Teacher> teacherMap =  new HashMap<Integer,Teacher>();
			teacherMap.put(1, teacher1);
			teacherMap.put(2, teacher2);
			
			school1.setStudentMap(studentMap);
			school1.setTeacherMap(teacherMap);
			
			System.out.println("Students are : ");
			Iterator iteStudent = studentMap.entrySet().iterator();
			while(iteStudent.hasNext())
			{
				Map.Entry studentEntry = (Entry) iteStudent.next();
				System.out.println(studentEntry.getValue());
			}

			
			System.out.println("Teachers are : ");
			Iterator iteTeacher = teacherMap.entrySet().iterator();
			while(iteTeacher.hasNext())
			{
				Map.Entry teacherEntry = (Entry)iteTeacher.next();
				System.out.println(teacherEntry.getValue());
			}
		
	}

}
