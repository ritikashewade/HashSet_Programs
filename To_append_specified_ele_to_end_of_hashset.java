package HashSet_Prog;

import java.util.*;

public class To_append_specified_ele_to_end_of_hashset {
public static void main(String[] args) {
	HashSet<Integer> ref = new HashSet();
	ref.add(10);
	ref.add(50);
	ref.add(60);
	ref.add(55);
	ref.add(29);
	
	Deque ref1= new LinkedList(ref);
	ref1.addLast(50);
	System.out.println(ref1);
}
}
