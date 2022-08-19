import java.util.*;

public class HashMap2{
	public static LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	public static LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<Character, Integer>();
	public static ArrayList<Integer> ar = new ArrayList<Integer>();

	public static void main(String arg[]){

		map.put('H',2);
		map.put('A',4);
		map.put('R',2);
		map.put('I',2);
		map.put('V',1);
		map.put('T',1);

	for(int value : map.values())
		ar.add(value);
	Collections.sort(ar);

	for(int num : ar)
	{
		for(Map.Entry<Character,Integer> entry : map.entrySet())
		{
			System.out.println(num+" "+entry.getValue());
			if(entry.getValue().equals(num))
				
				sortedMap.put(entry.getKey(), entry.getValue());
		}
	}

	//for(char key : sortedMap.keySet())
	//	System.out.println(key+"  "+sortedMap.get(key));

	}
}