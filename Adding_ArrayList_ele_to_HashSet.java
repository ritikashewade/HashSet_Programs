package HashSet_Prog;

import java.util.*;

public class Adding_ArrayList_ele_to_HashSet {
public static void main(String[] args) {
	ArrayList<Integer> ref1 = new ArrayList();
	ref1.add(50);
	ref1.add(60);
	ref1.add(55);
	ref1.add(29);
	System.out.println(ref1);
	
	Set<Integer> ref = new HashSet();
	ref.add(10);
	ref.add(60);
	ref.addAll(ref1);
	System.out.println(ref);
	
}
}
