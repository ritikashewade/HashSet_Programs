package HashSet_Prog;

import java.util.HashSet;
import java.util.Set;

public class To_iterate_through_all_ele_in_hash_list {
public static void main(String[] args) {
	Set<Integer> ref = new HashSet();
	ref.add(10);
	ref.add(50);
	ref.add(60);
	ref.add(55);
	ref.add(29);
	for(Integer i:ref) {
		System.out.print(i+" ");
	}
}
}
