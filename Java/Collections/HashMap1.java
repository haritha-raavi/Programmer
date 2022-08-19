import java.util.*;

public class HashMap1{
	static HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	public static void main(String ar[]){
	map.put('H',2);
	map.put('A',2);
	map.put('R',1);
	map.put('I',1);
	map.put('T',1);
	
	//Using iterator..

	Iterator<Map.Entry<Character, Integer>> i1 = map.entrySet().iterator(); // Iterate over Key Value pairs
	Iterator<Character> i2 = map.keySet().iterator();				// Iterate over Only keys
	Iterator<Integer> i3 = map.values().iterator();					// Iterate over Only values
	
	while(i1.hasNext()){
		Map.Entry<Character, Integer> entry = i1.next();
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	
	//Using for each loop..It also works for all the three ways mentioned above.

	for(Map.Entry<Character, Integer> entry : map.entrySet())
		System.out.println(entry.getKey()+" "+ entry.getValue());

	
		
	}
}
	
	