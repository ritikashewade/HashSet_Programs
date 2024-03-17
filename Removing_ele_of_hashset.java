package HashSet_Prog;

import java.util.HashSet;
import java.util.Set;

public class Removing_ele_of_hashset {
public static void main(String[] args) {
	Set<Integer> ref = new HashSet();
	ref.add(10);
	ref.add(50);
	ref.add(60);
	ref.add(55);
	ref.add(29);
	System.out.println(ref);
	ref.remove(55);
	System.out.println(ref);
}
}
