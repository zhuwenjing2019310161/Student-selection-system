# 实验三  学生选课模拟系统
## 一、实验目的  
1、初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；  
2、掌握面向对象的类设计方法（属性、方法）；  
3、掌握类的继承用法，通过构造方法实例化对象；  
4、学会使用super()，用于实例化子类；  
5、掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
## 二、业务要求  
1、说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。  
2、对象示例： a.人员（编号、姓名、性别……）  
             b.教师（编号、姓名、性别、所授课程、……）  
             c.学生（编号、姓名、性别、所选课程、……）  
             d.课程（编号、课程名称、上课地点、时间、授课教师、……）
## 三、实验要求  
1.编写上述实体类以及测试主类（注意类之间继承关系的适用）  
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师等）；从而模拟学生选课和退课的操作，选择完毕后再打印课程信息。  
3.编写实验报告。
## 四、实验过程  
1.首先创建一个package：expt2。  
2.在expt2中实例化五个类：Teacher、Student、Course、People和Test_courseChoosesyst。  
3.People类：  
(a)父类，主要为其他三个同包子类提供变量。设置最重要的两个变量：stuNum、courseNumber，用于计数判断。
(b)提供默认构造方法和toString方法。  
4.Teacher类：  
(a)创建两个private属性：teacherName和teacherId分别表示老师姓名和老师工号，并从父类中继承编号（num）、性别（sex）。  
(b)创建构造方法，调用本类的方法实现信息（编号、姓名、性别、工号）的打印。  
(c)在打印授课名称时，运用super语法调用People类中course变量。   
5.Student类：  
(a)创建两个private属性：StudentName和StudentId分别表示学生姓名和学生学号，并从父类中继承编号（num）、性别（sex）。  
(b)创建构造方法，调用本类的方法实现信息（编号、姓名、性别、学号、课程数）的打印。  
(c)在打印授课名称时，运用super语法调用People类中courseNumber变量。  
(d)创建一组关于课程数加减的方法：addCourses和reduceCourses，来实现对课程数的修改。    
6.Course类：  
(a)创建三个private属性：num、name和add分别表示课程编号、课程名称和上课地址。      
(b)创建构造方法，调用本类的方法实现信息（编号、姓名、性别、学号、课程数）的打印。  
(c)在打印授课名称时，运用super语法调用People类中courseNumber变量。  
(d)创建一组关于选课学生人数加减的方法：addStuNum和reduceStuNum，来实现对学生人数的修改。    
7.Test_courseChoosesyst类：  
(a)调用Teacher、Student、Course类，java.util.Scanner用来实现控制台输入信息。  
(b)创建三个方法：judgeStu、judgeChoose、courseChoose依次对输入数据进行判断。  
(c)创建两个个方法：addWork、reduceWork根据对变量stuNum、courseNum的同时判断，来实现对不同学生选择不同的老师计数。  
(d)创建一组打印方法：printAll、printTeacher、printTeacherAll、printStudent、printStudentAll、printCourse、printCourseAll进行信息的打印。  
(e)最后在主方法中建立一个循环：能够保持选课系统持续存在，方便多次选课。接受第一次数据输入，调用judge（）方法开始进行选课。选课完毕，调用printAll（）方法打印信息。
## 五、流程图

## 六、核心代码  
1、代码一：类名为Student/Teacher/Course/People/Test_courseChoosesys，这五类。然后创建属性和构造方法。以下代码为例子：
```
public Student(int number,String name,String sex,String id,int course)
{	setNum(number);
	setStudentName(name);
	setStudentId(id);
	setCourses(course);
}
public int getNum(){
	return num;	
}
void setNum(int number) {
	this.num=number;
  ......
```
2、代码二：所选课程、选课学生数量的增加和减少。
```
public void addCourses(int courseNumber) {
	this.courseNumber = courseNumber+1;
}
public void reduceCourses(int courseNumber) {
	this.courseNumber = courseNumber-1;
}
public int getCourses() {
	return courseNumber;
}
......
```
```
public void addStuNum(int stuNum) {
	super.stuNum = stuNum+1;
}
public void reduceStuNum(int stuNum) {
	super.stuNum = stuNum-1;
}
......
```
3、代码三：人员的两种构造方法并且定义字符串类型的id和姓名。
```
People(){}
People(String id[],String name){}
......
```
4、代码四：利用循环结构获取和记录学生信息，并且打印。
```
for(;;) {printStudentAll();
	Scanner reader = new Scanner(System.in);
	int x =reader.nextInt();
	stuNum=x;
	judgeStu(x);
	printAll();
		}
```
5、代码五：选择学生，并判断其是否选课或退课。
```
ublic static void judgeStu(int Num) {
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
```  
6、代码六：确定退课或选课，并选择其课程编号输出。
```
public static void judgeChoose(int Num) {
		Scanner reader = new Scanner(System.in);
		printCourseAll();
		int z =reader.nextInt();
		courseNum=z;
		if(Num==1){
			courseChoose(z);
		    addWork(stuNum,courseNum);
		    }
		if(Num==2){
			courseChoose(z);
		    reduceWork(stuNum,courseNum);
		    }
	}
```  
7、代码七：循环结构为框架，选择课程并打印其授课教师信息。
```  
public static void courseChoose(int Num) {
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
```  
8、代码八：利用循环结构统计选课学生人数及学生所选课程数。
```
public static void addWork(int stuNum,int courseNum) {
		if (stuNum==1 && courseNum==1) {
		cou0.addStuNum(cou0.getStuNum());
		stu0.addCourses(stu0.getCourses());
		}
		else if (stuNum==1 && courseNum==2) {
		cou1.addStuNum(cou1.getStuNum());
		stu0.addCourses(stu0.getCourses());
		}
		......}
```
```
public static void reduceWork(int stuNum,int courseNum) {
		if (stuNum==1 && courseNum==1) {
		cou0.reduceStuNum(cou0.getStuNum());
		stu0.reduceCourses(stu0.getCourses());
		}
		else if (stuNum==1 && courseNum==2) {
		cou1.reduceStuNum(cou1.getStuNum());
		stu0.reduceCourses(stu0.getCourses());
		}
		......}
```  
9、代码九：打印选课结果，包括学生信息，教师信息，课程信息。以下为学生信息的例子。
```
public static void printAll() {
		System.out.println("<学生选课系统>");
		System.out.println("<学生信息>");
		System.out.println("编号  姓名    性别       学号        已选课程数");
		System.out.println(""+stu0.getNum()+"  "+stu0.getStudentName()+"  "+stu0.getSex()+"   "+stu0.getStudentId()+"   "+stu0.getCourses());
		System.out.println(""+stu1.getNum()+"  "+stu1.getStudentName()+"  "+stu1.getSex()+"  "+stu1.getStudentId()+"   "+stu1.getCourses());
		System.out.println(""+stu2.getNum()+"  "+stu2.getStudentName()+"  "+stu2.getSex()+"   "+stu2.getStudentId()+"   "+stu2.getCourses());
		......}
```
## 七、运行结果  
![实验结果.jpg](https://i.loli.net/2020/10/25/jQmlNwu5WFDVo4n.jpg)  
## 八、实验感受  
本次实验主要是初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，能够学会定义类中的属性以及方法并且掌握面向对象的类设计方法、继承用法，构造方法实例化对象。
