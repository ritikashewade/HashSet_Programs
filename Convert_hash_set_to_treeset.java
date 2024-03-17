package HashSet_Prog;

import java.util.*;

public class Convert_hash_set_to_treeset {
public static void main(String[] args) {
	Set ref = new HashSet();
	ref.add(20);
	ref.add(60);
	ref.add(90);
	System.out.println(ref);
	
	Set ref1 = new TreeSet(ref);
	
	System.out.println(ref1);
	
}
}
