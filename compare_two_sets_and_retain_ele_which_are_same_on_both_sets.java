package HashSet_Prog;

import java.util.*;

public class compare_two_sets_and_retain_ele_which_are_same_on_both_sets {
	public static void main(String[] args) {
		Set ref1 = new HashSet();
		ref1.add(20);
		ref1.add(40);
		ref1.add(60);
		ref1.add(50);
		System.out.println(ref1);
		
		Set ref2 = new HashSet();
		ref2.add(60);
		ref2.add(20);
		ref2.add(70);
		ref2.add(10);
		System.out.println(ref2);
		
		Set ref3 = new HashSet();
		
		for(Object obj : ref1) {
			for(Object obj1:ref2) {
				if(obj.equals(obj1)) {
					ref3.add(obj);
				}
			}
		}
		System.out.println(ref3);
		
	}
}
