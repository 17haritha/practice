package xyz;
class Student1
{
	int sid;
	String sname;
	int marks;
	void input(int x,String y, int z)

{
	sid = x;
	sname = y;
	marks = z;
	
}
 void output() {
	System.out.println(sid+" "+sname+" "+marks);
 }
 }
 

public class studentdetails {

	public static void main(String[] args) {
		Student1 sc=new Student1();
		sc.input(53,"hari" ,600);
		sc.output();

	}

}
