package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class CollectionExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Chikuu");
		list.add("Banana");
		list.add("Cherry");
		list.add("Orange");
		list.add("Dragon fruit");
		
		String[] array = list.toArray(new String[0]);
		System.out.println("Arrays from collection: ");
		for(String s: array) {
			System.out.println(s);
		}
		
		System.out.println("---------");
		
		System.out.println("Original list: "+ list);
		Collections.shuffle(list);
		System.out.println("Shuffle list: "+ list);
		
		System.out.println("---------");
		
		List<String> mainList = Arrays.asList("A", "B", "C", "D", "E");
		List<String> subList = mainList.subList(1, 4);
		System.out.println("Sublist from mainList (index 1 to 3): " + subList);

        System.out.println("----------------------");
        
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println("Iterating over HashMap:");
        for (Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        System.out.println("----------------------");
        
        List<Integer> numbers = Arrays.asList(10, 4, 23, 5, 99, 2);

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        System.out.println("List: " + numbers);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

	}

}
