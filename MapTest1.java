import java.util.Scanner;
import java.util.*;
public class MapTest1{
	
	private static Map<Integer,Integer> hashMap = new HashMap<>();
	
	public static void main(String []args)
	{
		Scanner myinput = new Scanner(System.in);
		//
		Integer key, value;	
		
		//adding to map
		hashMap.put(3,3);
		hashMap.put(4,3);
		hashMap.put(3,4);
		hashMap.put(5,7);
		hashMap.put(7,5);
		hashMap.put(6,3);
		System.out.println(hashMap);		
	
		//find min key		
		Map.Entry<Integer, Integer> min = Collections.min(hashMap.entrySet(), new Comparator<Map.Entry<Integer, Integer>>(){
			public int compare(Map.Entry<Integer, Integer> entry1,Map.Entry<Integer, Integer> entry2){
				return entry1.getValue().compareTo(entry2.getValue());
			}
		});
		System.out.println("min key " + min.getKey());
		try{
			//removing from hashMap
			System.out.println("Remove from hashMap");
			System.out.println("add key to be removed");
			key = myinput.nextInt();
			System.out.println("add value to be removed");
			value =myinput.nextInt();
			hashMap.remove(key,value);
			System.out.println(hashMap);
			
		}catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		
		
		
		
		
	}
}