package HashSet_Prog;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Convert_hashset_to_array {
	public static void main(String[] args) {
		Set<Integer> ref = new HashSet();
		ref.add(20);
		ref.add(60);
		ref.add(90);
		System.out.println(ref);
		
		Object a[]=ref.toArray();
		System.out.println(Arrays.toString(a));
	}
}
