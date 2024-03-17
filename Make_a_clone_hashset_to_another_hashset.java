package HashSet_Prog;

import java.util.*;

public class Make_a_clone_hashset_to_another_hashset {
	public static void main(String[] args) {
		HashSet ref = new HashSet();
		ref.add("Hi");
		ref.add(40);
		ref.add('a');
		System.out.println(ref);
	
		HashSet ref1 = new HashSet();
		 ref1 =  (HashSet) ref.clone();
		 System.out.println(ref1);
	}
}
