package expt2;
import expt2.Course;
import expt2.Teacher;
import expt2.Student;
import java.util.Scanner;
public abstract class Test_courseChoosesyst {
	
	static Student stu0 = new Student(1,"陆仁贾", "   男   " , "  S001 " ,0);
	static Student stu1 = new Student(2,"Coco", " 女  " , "   S002 " ,0);
	static Student stu2 = new Student(3,"张思锐", "   男   " , "  S003 " ,0);
	static Teacher tea0 = new Teacher(1,"小荀", "  女   " ," T001 ","大学物理");
	static Teacher tea1 = new Teacher(2,"老杨", "  男   " ," T002 ","高等数学");
	static Course cou0 = new Course(1,"线性代数","教104",0);
	static Course cou1 = new Course(2,"高等数学","教201",0);
	static int courseNum;
	static int stuNum;
	public static void main(String[] args) {
		
	for(;;) {
			printStudentAll();
			Scanner reader = new Scanner(System.in);//录入语法
			int x =reader.nextInt();//获取学生编号
			stuNum=x;//记录学生编号
			judgeStu(x);//选择学生
			printAll();
		}
	
		
	}
	public static void judgeStu(int Num) {//选择学生 判断是否退课
		Scanner reader = new Scanner(System.in);
		printStudent(stuNum);
		System.out.println("1.选课\n2.退课");
		int y =reader.nextInt();
		if(Num==1)
			judgeChoose(y);
		if(Num==2)
			judgeChoose(y);
		if(Num==3)
			judgeChoose(y);
	}
	public static void judgeChoose(int Num) {//确认退课选课，选择课程编号
		Scanner reader = new Scanner(System.in);
		printCourseAll();
		int z =reader.nextInt();
		courseNum=z;//记录课程编号
		if(Num==1){//选课
			courseChoose(z);
		    addWork(stuNum,courseNum);
		    }
		if(Num==2){//退课
			courseChoose(z);
		    reduceWork(stuNum,courseNum);
		    }
	}
	public static void courseChoose(int Num) {//选择课程并打印老师
		Scanner reader = new Scanner(System.in);
		if(Num==1) {
			printTeacher(1);
		    }
		if(Num==2) {
			printTeacher(2);
			}
	}
	public static void informationSure(int Num) {
		System.out.println("1.确认\n2.返回");
		if(Num==1) {}
		else if(Num==2) {};
	}
	
	public static void addWork(int stuNum,int courseNum) {
		if (stuNum==1 && courseNum==1) {
		cou0.addStuNum(cou0.getStuNum());
		stu0.addCourses(stu0.getCourses());
		}
		else if (stuNum==1 && courseNum==2) {
		cou1.addStuNum(cou1.getStuNum());
		stu0.addCourses(stu0.getCourses());
		}
		else if (stuNum==2 && courseNum==1) {
		cou0.addStuNum(cou0.getStuNum());
		stu1.addCourses(stu1.getCourses());
		}
		else if (stuNum==2 && courseNum==2) {
			cou1.addStuNum(cou1.getStuNum());
			stu1.addCourses(stu1.getCourses());
			}
		else if (stuNum==3 && courseNum==1) {
			cou0.addStuNum(cou0.getStuNum());
			stu2.addCourses(stu2.getCourses());
			}
		else if (stuNum==3 && courseNum==2) {
			cou1.addStuNum(cou1.getStuNum());
			stu2.addCourses(stu2.getCourses());
			}
	}
	public static void reduceWork(int stuNum,int courseNum) {
		if (stuNum==1 && courseNum==1) {
			cou0.reduceStuNum(cou0.getStuNum());
			stu0.reduceCourses(stu0.getCourses());
			}
		else if (stuNum==1 && courseNum==2) {
			cou1.reduceStuNum(cou1.getStuNum());
			stu0.reduceCourses(stu0.getCourses());
			}
		else if (stuNum==2 && courseNum==1) {
			cou0.reduceStuNum(cou0.getStuNum());
			stu1.reduceCourses(stu1.getCourses());
			}
		else if (stuNum==2 && courseNum==2) {
				cou1.reduceStuNum(cou1.getStuNum());
				stu1.reduceCourses(stu1.getCourses());
				}
		else if (stuNum==3 && courseNum==1) {
				cou0.reduceStuNum(cou0.getStuNum());
				stu2.reduceCourses(stu2.getCourses());
				}
		else if (stuNum==3 && courseNum==2) {
				cou1.reduceStuNum(cou1.getStuNum());
				stu2.reduceCourses(stu2.getCourses());
				}	
	}
	public static void printAll() {
		System.out.println("<学生选课系统>");
		System.out.println("<学生信息>");
		System.out.println("编号  姓名    性别       学号        已选课程数");
		System.out.println(""+stu0.getNum()+"  "+stu0.getStudentName()+"  "+stu0.getSex()+"   "+stu0.getStudentId()+"   "+stu0.getCourses());
		System.out.println(""+stu1.getNum()+"  "+stu1.getStudentName()+"  "+stu1.getSex()+"  "+stu1.getStudentId()+"   "+stu1.getCourses());
		System.out.println(""+stu2.getNum()+"  "+stu2.getStudentName()+"  "+stu2.getSex()+"   "+stu2.getStudentId()+"   "+stu2.getCourses());
		System.out.println("<教师信息>");
		System.out.println("编号   姓名    性别     工号            所授课程");
		System.out.println(""+tea0.getNum()+"  "+tea0.getTeacherName()+"  "+tea0.getSex()+"   "+tea0.getTeacherId()+"   "+tea0.gettchCourse());
		System.out.println(""+tea1.getNum()+"  "+tea1.getTeacherName()+"  "+tea1.getSex()+"   "+tea1.getTeacherId()+"   "+tea1.gettchCourse());
		System.out.println("<课程信息>");
		System.out.println("编号     课程名称     教学地点      选课人数");
		System.out.println(""+cou0.getNum()+"   "+cou0.getName()+"     "+cou0.getAdd()+"       "+cou0.getStuNum());
		System.out.println(""+cou1.getNum()+"   "+cou1.getName()+"     "+cou1.getAdd()+"       "+cou1.getStuNum());
	}
	public static void printTeacher(int x) {//打印单条教师信息
		
		System.out.println("<教师信息>");
		System.out.println("编号     姓名   性别    工号     所授课程");
		if (x==1)
			System.out.println("  "+tea0.getNum()+"  "+tea0.getTeacherName()+" "+tea0.getSex()+" "+tea0.getTeacherId()+" "+tea0.gettchCourse());
		if (x==2)
			System.out.println("  "+tea1.getNum()+"  "+tea1.getTeacherName()+" "+tea1.getSex()+" "+tea1.getTeacherId()+" "+tea1.gettchCourse());
		    System.out.println("*******************");
	}
    public static void printTeacherAll() {//打印所有教师信息
		
		System.out.println("<教师信息>");
		System.out.println("编号      姓名    性别    工号      所授课程");
		System.out.println("选课人数"+cou0.getStuNum()+"已选课程数"+stu0.getCourses());
		System.out.println("   "+tea0.getNum()+"   "+tea0.getTeacherName()+" "+tea0.getSex()+"  "+tea0.getTeacherId()+" "+tea0.gettchCourse());
		System.out.println("   "+tea1.getNum()+"   "+tea1.getTeacherName()+" "+tea1.getSex()+"  "+tea1.getTeacherId()+" "+tea1.gettchCourse());		
	}
    public static void printStudent(int x) {
    	System.out.println("<学生信息>");
		System.out.println(" 编号     姓名      性别     学号    已选课程数");
		if (x==1)
			System.out.println("  "+stu0.getNum()+"  "+stu0.getStudentName()+" "+stu0.getSex()+" "+stu0.getStudentId()+"   "+stu0.getCourses());
		if (x==2)
			System.out.println("  "+stu1.getNum()+"  "+stu1.getStudentName()+" "+stu1.getSex()+" "+stu1.getStudentId()+"   "+stu1.getCourses());
		if (x==3)
			System.out.println("  "+stu2.getNum()+"  "+stu2.getStudentName()+" "+stu2.getSex()+" "+stu2.getStudentId()+"   "+stu2.getCourses());
    }
    public static void printStudentAll() {
    	System.out.println("<学生信息>");
		System.out.println(" 编号      姓名     性别    学号   已选课程数");
		System.out.println("  "+stu0.getNum()+"  "+stu0.getStudentName()+" "+stu0.getSex()+" "+stu0.getStudentId()+"   "+stu0.getCourses());
		System.out.println("  "+stu1.getNum()+"  "+stu1.getStudentName()+" "+stu1.getSex()+" "+stu1.getStudentId()+"   "+stu1.getCourses());
		System.out.println("  "+stu2.getNum()+"  "+stu2.getStudentName()+" "+stu2.getSex()+" "+stu2.getStudentId()+"   "+stu2.getCourses());
		System.out.println("请输入学生编号：");
    }
    public static void printCourse(int x) {
    	System.out.println("<课程信息>");
		System.out.println("编号    课程名称  教学地点      选课人数");
		if(x==1)
		System.out.println(""+cou0.getNum()+"    "+cou0.getName()+"  "+cou0.getAdd()+"    "+cou0.getStuNum());
		if(x==2)
		System.out.println(""+cou1.getNum()+"    "+cou1.getName()+"  "+cou1.getAdd()+"    "+cou1.getStuNum());
    }
    public static void printCourseAll() {
    	System.out.println("<课程信息>");
		System.out.println("编号     课程名称  教学地点      选课人数");
		System.out.println(""+cou0.getNum()+"    "+cou0.getName()+"  "+cou0.getAdd()+"    "+cou0.getStuNum());
		System.out.println(""+cou1.getNum()+"    "+cou1.getName()+"  "+cou1.getAdd()+"    "+cou1.getStuNum());
		System.out.println("请输入选择课程编号：");
    }
}
