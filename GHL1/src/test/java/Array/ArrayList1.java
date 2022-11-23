package Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	
	public static void main(String[] args) {
		
		
		
		List <String> L = new ArrayList<String>();
		
		System.out.println(L.add("TC01"));       // .add method used to add data in collection
		System.out.println(L.add("TC02"));
		System.out.println(L.size());            // check size of collection
		
		L.add(1, "TC03");                        // add data in collection based on index no
		L.add(2, "TC04");
		System.out.println(L.size());            // print size
		System.out.println(L.get(1));            // print data at index
		System.out.println(L.get(2));
		System.out.println(L.add("TC05"));       // Add data using add in sop
		System.out.println(L.add("TC06"));
		System.out.println(L.add("TC07"));
		System.out.println(L.size());
		
		System.out.println(L.get(0));            // get data by index number
		System.out.println(L.get(1));
		System.out.println(L.get(2));
		System.out.println(L.get(3));
		System.out.println(L.get(4));
		System.out.println(L.get(5));
		System.out.println(L.get(6));
		
		List <String> L1 = new ArrayList<String>();
		
		L1.addAll(L);
		System.out.println(L1.size());
		
		System.out.println(L1.add("TC11"));
		System.out.println(L1.add("TC12"));
		System.out.println(L1.add("TC13"));
		System.out.println(L1.add("TC14"));
		System.out.println(L1.add("TC15"));
		System.out.println(L1.size());
		
		System.out.println(L1.get(0));
		System.out.println(L1.get(1));
		System.out.println(L1.get(2));
		System.out.println(L1.get(3));
		System.out.println(L1.get(4));
		System.out.println(L1.get(5));
		System.out.println(L1.get(6));
		System.out.println(L1.get(7));
		System.out.println(L1.get(8));
		System.out.println(L1.get(9));
		System.out.println(L1.get(10));
		System.out.println(L1.get(11));
		
		System.out.println(L1.contains("TC02"));    // check method present in collection 
		System.out.println(L1.contains("TC17"));     
		System.out.println("***********");
		System.out.println(L1.containsAll(L));       //check collection contains all methods of
		                                             //previous collection
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		L1.removeAll(L);
		System.out.println(L1.size());
		
		List <String> L2 = new ArrayList<String>();
		System.out.println(L2.add("TC11"));
		System.out.println(L2.add("TC12"));
		System.out.println(L2.add("TC13"));
		System.out.println(L2.add("TC14"));
		System.out.println(L2.add("TC15"));
		System.out.println(L2.add("TC15"));
		System.out.println(L2.add("TC15"));
		System.out.println(L2.size());
		
		System.out.println(L2.contains("TC15"));
		System.out.println(L1.containsAll(L2));
		
		System.out.println(L2.equals(L1));          // used to compare data B/W two collection
		                                            // depending on size of collections
		                                            // data should be same in both collections
		System.out.println("###################");
		System.out.println(L2.isEmpty());           // check collection empty or not
		System.out.println(L2.lastIndexOf("TC15")); // check last index of collection
		      // if index is not present in collection we get O/P -1
	
		
		List <String> L3 = new ArrayList<String>();
		
		L3.addAll(L2);
		System.out.println(L3.equals(L2));          
		
		System.out.println("=====================================");
		List L4 = new ArrayList();
		L4.add("132");
		L4.add("abcd");
		L4.add("098");
		L4.add("098");
		L4.add("xyz");
		L4.add("098");
		L4.add("098");
		System.out.println(L4.get(0));
		System.out.println(L4.get(1));
		System.out.println(L4.size());
	
		System.out.println(L4.indexOf("132"));     // check at which index no data is present
		//System.out.println(L4.remove(0));          // remove data at given index number.
		//System.out.println(L4.size());
		
		//System.out.println(L4.remove("098"));      // to remove data from collection using data
		System.out.println(L4.get(0));
		System.out.println(L4.get(1));
		System.out.println(L4.get(2));
		System.out.println(L4.get(3));
		System.out.println(L4.get(4));
		System.out.println(L4.get(5));
		System.out.println(L4.get(6));
		
		System.out.println(L4.remove("098"));
		System.out.println("1111111111111111111111111111");
		System.out.println(L4.get(0));
		System.out.println(L4.get(1));
		System.out.println(L4.get(2));
		System.out.println(L4.get(3));
		System.out.println(L4.get(4));
		System.out.println(L4.get(5));
		
		// If we have multiple data with same name and we use remove by data then 1st data found 
		// according to index number will be removed.
		
		System.out.println(L4.size());
		L4.clear();                      // return type is void
		System.out.println(L4.size());
		
		
	}
}
