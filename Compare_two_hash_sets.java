package HashSet_Prog;

import java.util.HashSet;
import java.util.Set;

public class Compare_two_hash_sets {
public static void main(String[] args) {
	Set ref1 = new HashSet();
	ref1.add(60);
	ref1.add(20);
	ref1.add(70);
	ref1.add(10);
	System.out.println(ref1);
	
	Set ref2 = new HashSet();
	ref2.add(60);
	ref2.add(20);
	ref2.add(70);
	ref2.add(10);
	System.out.println(ref2);

	
	
	if(ref1.equals(ref2)) {
		System.out.println(true);
	}
	else
	{
		System.out.println(false);
	}
}
}
