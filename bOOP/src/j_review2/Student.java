package j_review2;

public class Student{

	String name;
	String dept;
	
	Student(){}
	
	Student(String name, String dept){
		this.name = name;
		this.dept = dept;
	}
	
	public boolean equals(Object obj) {
		Student s2 = (Student)obj;
		
		if( name.equals( s2.name )) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		return "이름:"+name + "/학과:" +dept;
	}
	
	
}
