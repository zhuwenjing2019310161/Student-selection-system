package expt2;
import expt2.Course;
import expt2.Teacher;
import expt2.Student;
import java.util.Scanner;
public abstract class Test_courseChoosesyst {
	
	static Student stu0 = new Student(1,"½�ʼ�", "   ��   " , "  S001 " ,0);
	static Student stu1 = new Student(2,"Coco", " Ů  " , "   S002 " ,0);
	static Student stu2 = new Student(3,"��˼��", "   ��   " , "  S003 " ,0);
	static Teacher tea0 = new Teacher(1,"С��", "  Ů   " ," T001 ","��ѧ����");
	static Teacher tea1 = new Teacher(2,"����", "  ��   " ," T002 ","�ߵ���ѧ");
	static Course cou0 = new Course(1,"���Դ���","��104",0);
	static Course cou1 = new Course(2,"�ߵ���ѧ","��201",0);
	static int courseNum;
	static int stuNum;
	public static void main(String[] args) {
		
	for(;;) {
			printStudentAll();
			Scanner reader = new Scanner(System.in);//¼���﷨
			int x =reader.nextInt();//��ȡѧ�����
			stuNum=x;//��¼ѧ�����
			judgeStu(x);//ѡ��ѧ��
			printAll();
		}
	
		
	}
	public static void judgeStu(int Num) {//ѡ��ѧ�� �ж��Ƿ��˿�
		Scanner reader = new Scanner(System.in);
		printStudent(stuNum);
		System.out.println("1.ѡ��\n2.�˿�");
		int y =reader.nextInt();
		if(Num==1)
			judgeChoose(y);
		if(Num==2)
			judgeChoose(y);
		if(Num==3)
			judgeChoose(y);
	}
	public static void judgeChoose(int Num) {//ȷ���˿�ѡ�Σ�ѡ��γ̱��
		Scanner reader = new Scanner(System.in);
		printCourseAll();
		int z =reader.nextInt();
		courseNum=z;//��¼�γ̱��
		if(Num==1){//ѡ��
			courseChoose(z);
		    addWork(stuNum,courseNum);
		    }
		if(Num==2){//�˿�
			courseChoose(z);
		    reduceWork(stuNum,courseNum);
		    }
	}
	public static void courseChoose(int Num) {//ѡ��γ̲���ӡ��ʦ
		Scanner reader = new Scanner(System.in);
		if(Num==1) {
			printTeacher(1);
		    }
		if(Num==2) {
			printTeacher(2);
			}
	}
	public static void informationSure(int Num) {
		System.out.println("1.ȷ��\n2.����");
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
		System.out.println("<ѧ��ѡ��ϵͳ>");
		System.out.println("<ѧ����Ϣ>");
		System.out.println("���  ����    �Ա�       ѧ��        ��ѡ�γ���");
		System.out.println(""+stu0.getNum()+"  "+stu0.getStudentName()+"  "+stu0.getSex()+"   "+stu0.getStudentId()+"   "+stu0.getCourses());
		System.out.println(""+stu1.getNum()+"  "+stu1.getStudentName()+"  "+stu1.getSex()+"  "+stu1.getStudentId()+"   "+stu1.getCourses());
		System.out.println(""+stu2.getNum()+"  "+stu2.getStudentName()+"  "+stu2.getSex()+"   "+stu2.getStudentId()+"   "+stu2.getCourses());
		System.out.println("<��ʦ��Ϣ>");
		System.out.println("���   ����    �Ա�     ����            ���ڿγ�");
		System.out.println(""+tea0.getNum()+"  "+tea0.getTeacherName()+"  "+tea0.getSex()+"   "+tea0.getTeacherId()+"   "+tea0.gettchCourse());
		System.out.println(""+tea1.getNum()+"  "+tea1.getTeacherName()+"  "+tea1.getSex()+"   "+tea1.getTeacherId()+"   "+tea1.gettchCourse());
		System.out.println("<�γ���Ϣ>");
		System.out.println("���     �γ�����     ��ѧ�ص�      ѡ������");
		System.out.println(""+cou0.getNum()+"   "+cou0.getName()+"     "+cou0.getAdd()+"       "+cou0.getStuNum());
		System.out.println(""+cou1.getNum()+"   "+cou1.getName()+"     "+cou1.getAdd()+"       "+cou1.getStuNum());
	}
	public static void printTeacher(int x) {//��ӡ������ʦ��Ϣ
		
		System.out.println("<��ʦ��Ϣ>");
		System.out.println("���     ����   �Ա�    ����     ���ڿγ�");
		if (x==1)
			System.out.println("  "+tea0.getNum()+"  "+tea0.getTeacherName()+" "+tea0.getSex()+" "+tea0.getTeacherId()+" "+tea0.gettchCourse());
		if (x==2)
			System.out.println("  "+tea1.getNum()+"  "+tea1.getTeacherName()+" "+tea1.getSex()+" "+tea1.getTeacherId()+" "+tea1.gettchCourse());
		    System.out.println("*******************");
	}
    public static void printTeacherAll() {//��ӡ���н�ʦ��Ϣ
		
		System.out.println("<��ʦ��Ϣ>");
		System.out.println("���      ����    �Ա�    ����      ���ڿγ�");
		System.out.println("ѡ������"+cou0.getStuNum()+"��ѡ�γ���"+stu0.getCourses());
		System.out.println("   "+tea0.getNum()+"   "+tea0.getTeacherName()+" "+tea0.getSex()+"  "+tea0.getTeacherId()+" "+tea0.gettchCourse());
		System.out.println("   "+tea1.getNum()+"   "+tea1.getTeacherName()+" "+tea1.getSex()+"  "+tea1.getTeacherId()+" "+tea1.gettchCourse());		
	}
    public static void printStudent(int x) {
    	System.out.println("<ѧ����Ϣ>");
		System.out.println(" ���     ����      �Ա�     ѧ��    ��ѡ�γ���");
		if (x==1)
			System.out.println("  "+stu0.getNum()+"  "+stu0.getStudentName()+" "+stu0.getSex()+" "+stu0.getStudentId()+"   "+stu0.getCourses());
		if (x==2)
			System.out.println("  "+stu1.getNum()+"  "+stu1.getStudentName()+" "+stu1.getSex()+" "+stu1.getStudentId()+"   "+stu1.getCourses());
		if (x==3)
			System.out.println("  "+stu2.getNum()+"  "+stu2.getStudentName()+" "+stu2.getSex()+" "+stu2.getStudentId()+"   "+stu2.getCourses());
    }
    public static void printStudentAll() {
    	System.out.println("<ѧ����Ϣ>");
		System.out.println(" ���      ����     �Ա�    ѧ��   ��ѡ�γ���");
		System.out.println("  "+stu0.getNum()+"  "+stu0.getStudentName()+" "+stu0.getSex()+" "+stu0.getStudentId()+"   "+stu0.getCourses());
		System.out.println("  "+stu1.getNum()+"  "+stu1.getStudentName()+" "+stu1.getSex()+" "+stu1.getStudentId()+"   "+stu1.getCourses());
		System.out.println("  "+stu2.getNum()+"  "+stu2.getStudentName()+" "+stu2.getSex()+" "+stu2.getStudentId()+"   "+stu2.getCourses());
		System.out.println("������ѧ����ţ�");
    }
    public static void printCourse(int x) {
    	System.out.println("<�γ���Ϣ>");
		System.out.println("���    �γ�����  ��ѧ�ص�      ѡ������");
		if(x==1)
		System.out.println(""+cou0.getNum()+"    "+cou0.getName()+"  "+cou0.getAdd()+"    "+cou0.getStuNum());
		if(x==2)
		System.out.println(""+cou1.getNum()+"    "+cou1.getName()+"  "+cou1.getAdd()+"    "+cou1.getStuNum());
    }
    public static void printCourseAll() {
    	System.out.println("<�γ���Ϣ>");
		System.out.println("���     �γ�����  ��ѧ�ص�      ѡ������");
		System.out.println(""+cou0.getNum()+"    "+cou0.getName()+"  "+cou0.getAdd()+"    "+cou0.getStuNum());
		System.out.println(""+cou1.getNum()+"    "+cou1.getName()+"  "+cou1.getAdd()+"    "+cou1.getStuNum());
		System.out.println("������ѡ��γ̱�ţ�");
    }
}
