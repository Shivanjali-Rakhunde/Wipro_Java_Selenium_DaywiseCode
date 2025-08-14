package Task2.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;


public class CollectionSolution {

	 // 1. Shuffle elements in an ArrayList
    public void shuffleList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        java.util.Collections.shuffle(list);

        System.out.println("Shuffled List: " + list);
    }
    
 // 2. Extract portion of an ArrayList
    public void extractPortion() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        List<String> subList = list.subList(1, 3);
        System.out.println("Extracted Portion: " + subList);
    }
    
 // 4. Replace second element
    public void replaceSecondElement() {
        ArrayList<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.set(1, "Replaced");
        System.out.println("Modified List: " + list);
    }
    
    // 7. Clone HashSet
    public void cloneHashSet() {
       HashSet<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");

       HashSet<String> cloned = (HashSet<String>) set1.clone();
        System.out.println("Cloned Set: " + cloned);
    }
    
    public void convertToTreeSet() {
        HashSet<String> set = new HashSet<>();
        set.add("Banana");
        set.add("Apple");

        java.util.TreeSet<String> treeSet = new java.util.TreeSet<>(set);
        System.out.println("TreeSet: " + treeSet);
    }
    
 // 10. View keys in Map
    public void viewMapKeys() {
       Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");

        System.out.println("Keys: " + map.keySet());
    }
    
    
    public static void main(String[] args) {
    	CollectionSolution cs = new CollectionSolution();
    	cs.shuffleList();
    	cs.extractPortion();
    	cs.replaceSecondElement();
    	cs.cloneHashSet();
    	cs.convertToTreeSet();
    	cs.convertToTreeSet();
    	cs.viewMapKeys();
    	
    }

}
