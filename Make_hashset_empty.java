package HashSet_Prog;

import java.util.*;

public class Make_hashset_empty {
	public static void main(String[] args) {
		Set ref = new HashSet();
		ref.add(10);
		ref.add(50);
		ref.add(60);
		System.out.println(ref);
		ref.clear();
//		ref.removeAll(ref);
		System.out.println(ref);
	}
}
