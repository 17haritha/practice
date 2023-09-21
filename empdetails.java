package homelabs;
import java.util.*;  
class Com
{  
  int eid;  
  String name;
  double sal;

  Com(int eid,String name,double sal){  
   this.eid=eid;  
   this.name=name;  
   this.sal=sal;  
  }  
}  

public class Empdetails {

	public static void main(String[] args) {


  Com c1=new Com(101,"haritha",50000); 
  Com c2=new Com(102,"naresh",35000); 
  Com c3=new Com(103,"kanna",40000); 
  ArrayList<Com> al=new ArrayList<Com>(); 
  al.add(c1);//
  al.add(c2);  
  al.add(c3);  

  Iterator itr=al.iterator();  
    while(itr.hasNext()){  
	  Com co=(Com)itr.next();  
    System.out.println(co.eid+" "+co.name+" "+co.sal);  
  }  
 }  
}



