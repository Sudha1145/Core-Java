class Bottle
{
	public static void information(String brand)
	{
		System.out.println("running information in Bottle with String parameter");
		System.out.println("brand:"+brand);
	}
	public static void information(String brand,String quality)
	{
		System.out.println("running information in Bottle with two String parameter");
		System.out.println("brand:"+brand);
		System.out.println("quality:"+quality);
	}
	public static void information(String brand,String quality,double price)
	{
		System.out.println("running information in Bottle with two String and one double parameter");
		System.out.println("brand:"+brand);
		System.out.println("quality:"+quality);
		System.out.println("price:"+price);
	}
	public static void information(double quantity)
	{
		System.out.println("running information in Bottle with double parameter");
		System.out.println("quantity:"+quantity);
	}
	
}