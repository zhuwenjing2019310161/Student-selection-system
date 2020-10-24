# 实验三  学生选课模拟系统
## 一、实验目的  
1、初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；  
2、掌握面向对象的类设计方法（属性、方法）；  
3、掌握类的继承用法，通过构造方法实例化对象；  
4、学会使用super()，用于实例化子类；  
5、掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
## 二、业务要求  
1、说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。  
2、对象示例： 人员（编号、姓名、性别……）  
             教师（编号、姓名、性别、所授课程、……）  
             学生（编号、姓名、性别、所选课程、……）  
             课程（编号、课程名称、上课地点、时间、授课教师、……）
## 三、实验要求  
1.编写上述实体类以及测试主类（注意类之间继承关系的适用）  
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。  
3.编写实验报告。
## 四、实验过程  
1.首先创建一个package：expt2。  
2.在expt2包中实例化四个类：Teacher、Student、Course 、 People 和 Test_courseChoosesyst。  
3.People类中：  
(a).作为一个父类，主要为其他三个同包子类提供变量。（最重要两个变量：stuNum、courseNumber,用于计数判断）
(b).提供默认构造方法和toString方法。  
4.Teacher类中：  
(a)在Teacher类中创建两个private属性：teacherName和 teacherId分别表示老师姓名和老师工号，并从父类中继承编号（num）、性别（sex）。  
(b)创建构造方法，调用本类的方法实现信息（编号、姓名、性别、工号）的打印。  
(c)在打印授课名称时，运用super语法调用People类中course变量。   
5.Student类中：  
(a)在Student类中创建两个private属性：StudentName和 StudentId分别表示学生姓名和学生学号，并从父类中继承编号（num）、性别（sex）。  
(b)创建构造方法，调用本类的方法实现信息（编号、姓名、性别、学号、课程数）的打印。  
(c)在打印授课名称时，运用 super语法调用People类中courseNumber变量。  
(d)创建一组方法（课程数加减方法）：addCourses和reduceCourses，来实现对课程数修改。    
6.Course中：  
(a)在Course类中创建三个private属性：num、name和add分别表示编、课程名称和上课地址。      
(b)创建构造方法，调用本类的方法实现信息（编号、姓名、性别、学号、课程数）的打印。  
(c)在打印授课名称时，运用super语法调用People类中courseNumber变量。  
(d)创建一组方法（学生数加减方法）：addStuNum和reduceStuNum，来实现对学生数修改。    
7.Test_courseChoosesyst中：  
(a)在本类中，调用 Teacher、Student、Course类，以及java.util.Scanner用来实现控制台输入信息。  
(b)创建三个方法：judgeStu、judgeChoose、courseChoose依次对输入数据进行判断。  
(c)创建两个个方法：addWork、reduceWork根据对变量 stuNum、courseNum的同时判断，来实现对不同同学选择不同的老师计数。  
(d)创建一组打印方法：printAll、printTeacher、printTeacherAll、printStudent、printStudentAll、printCourse、printCourseAll方便主方法进行信息的打印。  
(e)最后在主方法中建立一个循环（保持选课系统持续存在，方便多次选课），接受第一次数据输入，调用judge（）方法开始进行选课。选课完毕，调用printAll（）方法打印信息。
## 五、核心代码  
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
2、代码二：课程、选课学生数量的增加和减少。
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
4、代码四：
```
```
5、代码五：
```
```
## 六、运行结果

## 七、实验感受  
本次实验主要是初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，能够学会定义类中的属性以及方法并且掌握面向对象的类设计方法、继承用法，构造方法实例化对象。
