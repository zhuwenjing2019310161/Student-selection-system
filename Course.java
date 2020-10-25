package expt2;

public class Course extends People{
int num;
String name;
String add;
	
public Course(int number,String name,String add,int stuNum)
{	setNum(number);
	setName(name);
	setAdd(add);
	setStuNum(stuNum);
}
public int getNum(){
	return num;	
}
void setNum(int number) {
	this.num=number;	
}
public String getName(){
	return name;	
}
void setName(String name) {
	this.name = name;
}
public String getAdd(){
		return add;	
	}
void setAdd(String add) {
		this.add = add;	
}
public int getStuNum(){
	return super.stuNum;	  
}
void setStuNum(int stuNum) {
	this.stuNum = stuNum;	
}
public void addStuNum(int stuNum) {
	super.stuNum = stuNum+1;
}
public void reduceStuNum(int stuNum) {
	super.stuNum = stuNum-1;
}
}
