package CollectionsEqualsMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionEquals {

	public static void main(String[] args) {
		
		System.out.println("===============Array List===============");
		
		List L = new ArrayList();
		L.add("TC01");
		L.add("TC02");
		L.add("TC03");
		L.add("TC04");
		L.add("TC05");
		L.add("TC06");
		System.out.println("Size of L = " + L.size());
		
		List L1 = new ArrayList();
		L1.addAll(L);
		System.out.println("Size of L1 after adding L collection = "+ L1.size());
		System.out.println("Collection L1==L --" +L1.equals(L));
		
		System.out.println("===============SET===============");
		
		Set S = new HashSet();
		S.add("TC11");
		S.add("TC12");
		S.add("TC13");
		S.add("TC14");
		S.add("TC15");
		S.add("TC16");
		S.add("TC17");
		System.out.println("Size of S = "+ S.size());
		
		Set S1 = new HashSet();
		S1.addAll(S);
		System.out.println("Size of S1 after adding S collection = "+ S1.size());
		System.out.println("Collection S1==S -- "+ S1.equals(S));
		
		System.out.println("===============HashMap===============");
		
		Map<Integer, String> M = new HashMap<Integer, String>();
		M.put(1, "TC100");
		M.put(2, "TC200");
		M.put(3, "TC300");
		M.put(4, "TC400");
		M.put(5, "TC500");
		M.put(6, "TC600");
		M.put(7, "TC700");
		M.put(8, "TC800");
		System.out.println("Size of M = "+M.size());
		
		Map<Integer, String> M1 = new HashMap<Integer, String>();
		M1.putAll(M);
		System.out.println("Size of M1 after adding M collection = "+M1.size());
		System.out.println("Collection M==M1 --"+M1.equals(M));
	}
}
