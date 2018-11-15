import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable4 {
	public static void main(String[] args) {
		 
		   Enumeration names;
		   String key;
		 
		   // Creating a Hashtable
		   Hashtable<String, String> hashtable = 
		              new Hashtable<String, String>();
		 
		   // Adding Key and Value pairs to Hashtable
		   hashtable.put("Key1","QIL");
		   hashtable.put("Key2","WIR");
		   hashtable.put("Key3","MUF");
		   hashtable.put("Key4","ZUL");
		   hashtable.put("Key5","MU");
		 
		   names = hashtable.keys();
		   while(names.hasMoreElements()) {
		      key = (String) names.nextElement();
		      System.out.println("Key: " +key+ " & Value: " +
		      hashtable.get(key));
		   }
		 }
		}


