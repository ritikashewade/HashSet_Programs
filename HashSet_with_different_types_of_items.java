package HashSet_Prog;

import java.util.HashSet;
import java.util.Set;

public class HashSet_with_different_types_of_items {
public static void main(String[] args) {
	Set ref = new HashSet();
	ref.add("hello");
	ref.add(420);
	ref.add(3.14);
	ref.add('@');
	ref.add(-8);
	System.out.println(ref);
}
}
