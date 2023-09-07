package homelabs;

public class stringbufferstringbuilder {

	public static void main(String[] args) {
	 StringBuffer s1=new StringBuffer("haritha");
	 StringBuffer s2=new StringBuffer("rowdy");
	 StringBuilder s3= new StringBuilder("haritha");
	 StringBuilder s4=new StringBuilder("reddy");
	 System.out.println(s1.reverse());
	 System.out.println(s1.delete(1,2));
	 System.out.println(s2.append("rowdy"));
	 System.out.println(s2.insert (1,'h'));
	 System.out.println (s4.length());
	}

}
