package homelabs;
class bankc {
	int acno;
	String fields;
	int amt;
	bankc (int x, String y,int z) {
		acno = x;
		fields =y;
		amt=z;
	}
	bankc()
	{ 
		acno=200;
		fields="savings";
		amt=100000;
		
	}
	void output() {
		System.out.println (acno+" "+fields+" "+amt);
	}
}
public class bankcustomer {

	public static void main(String[] args) {
		bankc b1=new bankc (53,"current",50000);
		bankc b2=new bankc();
		b1.output();
		b2.output();
	}

}
