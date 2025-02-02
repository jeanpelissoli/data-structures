package hashtable;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		HashTable ht = new HashTable();
		ht.set("nails", 100);
		ht.set("tile", 50);
		ht.set("lumber", 80);
		ht.set("bolts", 200);
		ht.print();

		System.out.println("val= " + ht.get("nails"));
		System.out.println("val= " + ht.get("lumber"));
		System.out.println("val= " + ht.get("bolts"));
		ArrayList<String> arrayL = new ArrayList<>();
		arrayL = ht.keys();
		for(String key : arrayL) {
			System.out.println(key);
		}

	}
}
