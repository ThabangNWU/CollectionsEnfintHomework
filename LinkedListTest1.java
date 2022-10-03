import java.util.*;
public class LinkedListTest1{
	
	public static void main (String [] args)
	{
		LinkedList<Integer> firstCollection = new LinkedList<>();
		LinkedList<Integer> secondCollection = new LinkedList<>();
		LinkedList<Integer> temp = new LinkedList<>();
		
		Scanner myInput = new Scanner(System.in);
		try{
			System.out.println("How many elements do you want to add on the first Collection?");
			int element = myInput.nextInt();
			for(int i = 0; i < element; i++)
			{
				firstCollection.add(myInput.nextInt());
			}
			System.out.println("How many elements do you want to add on the second Collection?");
				element = myInput.nextInt();
			for(int i = 0; i < element; i++)
			{
				secondCollection.add(myInput.nextInt());
			}
			System.out.println("First Collection: " + firstCollection);
			System.out.println("Second Collection: " + secondCollection);
			
			System.out.println("enter how many elements before inserting it");
			element = myInput.nextInt();
			
			for(int i =0; i < element ; i++){
				temp.add(firstCollection.pop());
				
			}
			for(int i =-2; i <= secondCollection.size();i++)
			{
				temp.add(secondCollection.pop());
			}
			
			if(firstCollection.isEmpty() == false)
			{
				for(int i =-1; i <= firstCollection.size();i++)
				{
				temp.add(firstCollection.pop());
				
				}
			}
			
			for(int num : temp)
			{
				firstCollection.add(num);
			}
			
			System.out.println(firstCollection);		
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		
		
	}
}