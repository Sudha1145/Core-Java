//3. Store 10 sweets in array and print all elements from array

class Sweets
{
	public static void main(String[] args)
	{
		String sweet= "Kunda";
		System.out.println("sweet:"+sweet);
		String sweet1= "Peda";
		System.out.println("sweet1:"+sweet1);
		String sweet2= "Mysore Pak";
		System.out.println("sweet2:"+sweet2);
		String sweet3= "Obbattu";
		System.out.println("sweet3:"+sweet3);
		String sweet4= "Chiroti";
		System.out.println("sweet4:"+sweet4);
		String sweet5= "Jamun";
		System.out.println("sweet5:"+sweet5);
		String sweet6= "Vermicelli Kheer";
		System.out.println("sweet6:"+sweet6);
		String sweet7= "Coconut Poli";
		System.out.println("sweet7:"+sweet7);
		String sweet8= "Rava Ladoo";
		System.out.println("sweet8:"+sweet8);
		String sweet9= "Rasgulla";
		System.out.println("sweet9:"+sweet9);
		
		String[] Sweets = {sweet,sweet1,sweet2,sweet3,sweet4,sweet5,sweet6,sweet7,sweet8,sweet9};
		int total = Sweets.length;
		System.out.println("Total no of Sweets:"+total);
		String ref = Sweets[8];
		System.out.println("Element at index 8:"+ref);		
	}
}
		