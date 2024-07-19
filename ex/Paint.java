class Paint
{
	public static void information(String brand)
	{
		System.out.println("running information in Paint with String parameter");
		System.out.println("brand:"+brand);
	}
	public static void information(String brand, String color)
	{
		System.out.println("running information in Paint with  two String parameter");
		System.out.println("brand:"+brand);
		System.out.println("color:"+color);
		
	}
	public static void information(String brand, double price)
	{
		System.out.println("running information in Paint with one String and one double parameter");
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
	}
	public static void information(String color,String type, double price)
	{
		System.out.println("running information in Paint with two String and one double parameter");
		System.out.println("color:"+color);
		System.out.println("type:"+type);
		System.out.println("price:"+price);
	}
	
}