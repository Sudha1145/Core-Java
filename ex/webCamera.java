class WebCamera{

	public static void capture()
	{
		String picture = "Animal";//info cannot change it from outside the method
		System.out.println("picture:"+picture);
	
	}
	public static void capture(String picture)//parameter
	{
		System.out.println("picture:"+picture);
	}
	
}