class Train
{
	public static void book(String source, String destination)
	{
		System.out.println("running information in Train with two String parameter");
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
	}
	public static void book(String source, String destination,double quantity)
	{
		System.out.println("running information in Train with two String and one double parameter");
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
		System.out.println("quantity:"+quantity);
	}
	public static void book(String source, String destination,double quantity, double price)
	{
		System.out.println("running information in Train with two String and one double parameter");
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+price);
	}
	public static void cancle(double ticketNo)
	{
		System.out.println("running information in Train with one double parameter");
		System.out.println("ticketNo:"+ticketNo);
	}
	public static void cancle(String source, String destination)
	{
		System.out.println("running information in Train with two String parameter");
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
	}
}
	