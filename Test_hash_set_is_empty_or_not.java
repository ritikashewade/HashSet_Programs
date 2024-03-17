package HashSet_Prog;

import java.util.*;

public class Test_hash_set_is_empty_or_not {
	public static void main(String[] args) {
		Set ref = new HashSet();
		ref.add(10);
		if(ref.isEmpty()) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
}
