package xyz;
class person {
	int pid;
	String pname;
	void input (int x, String y) {
		pid =x;
		pname =y;
	}
}
class stud extends person {
	int marks;
	void input (int z)  {
		marks =z;
	}
	void show ()
	{ 
		System.out.println(pid+" "+pname+" "+marks);
	}
}
class emp extends person {
	int  salary;
	void input (int s) {
		salary = s;
	}
	void show()
	{
		System.out.println(pid+" "+pname+" "+salary);
	}
}
public class person {

	public static void main(String[] args) {
		
		stud st = new stud ();
		st.input (45, "haritha");
		st.input(600);
		emp em = new emp ();
		em.input(45, "haritha");
		em.input (50000);
		st.show();
		em.show();
		
	
	}

}
