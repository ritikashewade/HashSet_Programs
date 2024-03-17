package HashSet_Prog;

import java.util.HashSet;
import java.util.Set;

public class To_get_num_of_ele_in_hashset {
	public static void main(String[] args) {
		Set<Integer> ref = new HashSet();
		ref.add(10);
		ref.add(50);
		ref.add(60);
		ref.add(55);
		ref.add(29);
		System.out.println(ref);
		System.out.println(ref.size());

		
	}
}
