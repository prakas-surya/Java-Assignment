package dynamic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// 1. Basic map operations
		Map<String, Integer> people = new HashMap<>();
		people.put("Alice", 30);
        people.put("Bob", 25);
        people.put("Charlie", 35);
        people.put("Diana", 28);
        people.put("Edward", 40);
        
        System.out.println("Age of charlie : " + people.get("Charlie"));
        
        System.out.println("All values of Map :");
        for (Map.Entry<String, Integer> entry : people.entrySet()) {
        	System.out.println("Name : " + entry.getKey() + ", Age : " + entry.getValue());
        }
        
        // 2. Iterate through a TreeMap
        TreeMap<String, Integer> fruits = new TreeMap<>();
        fruits.put("Grapes", 7);
        fruits.put("Apple", 4);
        fruits.put("Mango", 2);
        
        Iterator<Map.Entry<String, Integer>> iterator = fruits.entrySet().iterator();
        System.out.println("All values of TreeSet:");
        while (iterator.hasNext()) {
        	Map.Entry<String, Integer> entry = iterator.next();
        	System.out.println("Name : " + entry.getKey() + ", value : " + entry.getValue());
        }
        
        // 3. Check and remove entries
        Map<String, Integer> students = new HashMap<>();
        students.put("John", 85);
        students.put("Jane", 92);
        students.put("Tom", 76);
        students.put("Lucy", 89);
        
        System.out.println("Map before removing Tom :");
        System.out.println(students);
        
        if (students.containsKey("Tom")) students.remove("Tom");
        
        System.out.println("Map after removing Tom:");
        System.out.println(students);
        
        // 4. Count frequency of elements
        String input = "programming";
        
        Map<Character, Integer> frequency = new HashMap<>();
        
        for (int i=0; i<input.length(); i++) {
        	frequency.put(input.charAt(i), frequency.getOrDefault(input.charAt(i), 0) + 1);
        }
        
        System.out.println("Frequency of elements :");
        System.out.println(frequency);
        
        // 5. Merge two maps
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("b", 3);
        map2.put("c", 4);

        HashMap<String, Integer> mergedMap = mergeMaps(map1, map2);

        System.out.println("Map after merge: ");
        System.out.println(mergedMap);
	}
	
	public static HashMap<String, Integer> mergeMaps(HashMap<String, Integer> map1, HashMap<String, Integer> map2) {
        HashMap<String, Integer> result = new HashMap<>(map1);
        result.putAll(map2);
        return result;
    }

}