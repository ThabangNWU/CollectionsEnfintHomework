import java.util.*;
public class Arraylist1{
	
	static List<Integer> newNumber = new ArrayList<>();
	static Scanner myInput = new Scanner(System.in);
	public static void main (String [] args){
		try
		{
			List<Integer> num = new ArrayList<>();	
			System.out.println("How many elements do you want to add on arraylist?");
			int numElement = myInput.nextInt();
			System.out.println("Add elements to the collection");
			for(int i =0; i < numElement ; i++)
			{
				num.add(myInput.nextInt());
			}
			//adding elements from num to addToArrayList method
			for(Integer str: num)
			{			
				addToArrayList(str);
			}		
			System.out.println("old elements: "+newNumber);
			
			System.out.println("many elements do want to replace?");
			int elementReplace = myInput.nextInt();
			
			System.out.println("Replace old elements on the collection");
			for(int i =0; i < elementReplace;i++){
				num.set(i, myInput.nextInt());
			}
			
			System.out.println("new elements: "+num);
		}catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		
	}
	
	public static void addToArrayList(Integer number){		
		newNumber.add(number);	
	}
	
	
	
	


}