package MapBasedClasses.com;

import java.util.*;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap tm = new LinkedHashMap(); //The treeMap class always stores the elements in key-value pair.
		tm.put(771, "Deep"); // Here the put() method is used to add values into the TreeMap class.
		// (771, "Deep") --> here '771' is the key and 'Deep' is the value.
		tm.put(171, "Sandip"); // Here the keys should be unique but the values can be duplicate.
		tm.put(501, "Sourav");
		tm.put(111, "Soma");
		
		System.out.println(tm);
	}

}
