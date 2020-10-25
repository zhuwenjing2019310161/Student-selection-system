package expt2;

public class Teacher extends People{
private String teacherName;
private String teacherId;
public Teacher(int number,String name,String sex,String id,String course)
{       setNum(number);
		setTeacherName(name);
		setTeacherId(id);
		setTeacherSex(sex);
		settchCourses(course);
}
	public int getNum(){
		return num;	
	}
	void setNum(int number) {
		this.num=number;	
	}
	public String getTeacherName(){
		return teacherName;	
	}
	public String getTeacherId(){
		return teacherId;	
	}
	void TeacherName(String teacherName) {
	this.teacherName = teacherName;	
	}
	public String TeacherId(){
		return teacherId;	
	}
	void setTeacherName(String teacherName) {
		this.teacherName = teacherName;	
	}
	void setTeacherId(String teacherId) {
		this.teacherId = teacherId;	
	}
	void setTeacherSex(String sex) {
	    super.sex=sex;	
    }
	public String getSex(){
		return sex;	
	}
	public void settchCourses(String course) {
		super.course=course;
	}
	public String gettchCourse() {
		return super.course;
		}
	}

	
