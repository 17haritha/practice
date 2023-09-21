package homelabs;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class HashMapandLinkedHashMap {
 public static void main(String[] args) {
		 HashMap<Integer,String> map=new HashMap<Integer,String>();    
		   map.put(1,"karna");   
		   map.put(2,"haritha");    
		   System.out.println("Iterating Hashmap...");  
		   for(Map.Entry m : map.entrySet())
		   {    
		    System.out.println(m.getKey()+" "+m.getValue());  
		    LinkedHashMap<Integer, String> map1 = new LinkedHashMap<Integer, String>();           
		      map1.put(5,"FIVE");    
		     map1.put(6,"SIX");    
		     map1.put(7,"SEVEN");      
		       System.out.println("Keys: "+map1.keySet());    
		       System.out.println("Values: "+map1.values());  
		       System.out.println("Key-Value pairs: "+map1.entrySet());
		   }  
		}  
		}  
