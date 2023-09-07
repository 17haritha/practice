package homelabs;
		class institute {
			String initial;
			institute (String o) 
{
	initial=o;
	System.out.println(initial);
}
	public String toString() {
		return initial;
	}
}
public class Objectc {

public static void main(String[] args) {
	college c= new college("HARITHA");
	 college c1=c;
	System.out.println(c.equals(c1));
	System.out.println(c==c1);
	System.out.println(c.hashCode());
	System.out.println(c.toString());
	System.out.println(c.getClass());
}

}

