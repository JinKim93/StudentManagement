package school;

import java.util.ArrayList;

public class School {
	
	//싱글톤패턴
	private static School instance = new School();
	
	//학교가 가지고 있는 학생 정보 -> 학생 몇명있고, 학생 다니고 있고 -> 배열로 가지고 있기
	private ArrayList<Student> studentList = new ArrayList<Student>();
	//학교가 가지고 있는 과목 정보 -> DB 있으면 DB로 관리, 아직 없어서 배열로 관리 함
	private ArrayList<Subject> subjectList = new ArrayList<Subject>();
	
	private School() {}
	
	public static School getInstance () {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	//학생등록 메서드
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	//과목등록 메서드
	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}
	

}
