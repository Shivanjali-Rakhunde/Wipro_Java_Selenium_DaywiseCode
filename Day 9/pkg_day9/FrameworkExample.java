package pkg_day9;

import java.util.*;

public class FrameworkExample {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Steven");
		names.add("Alex");
		names.add("Bob");
		names.add("Alex");
		names.add("Turner");
		names.add("Martin");
		names.add("Fox");
		names.add("Jack");
		names.add("Lily");
		System.out.println("Before the sorting....." + names);
		Collections.sort(names);
		System.out.println("After the sorting......" + names);

	}

}
