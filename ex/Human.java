class Human
{
	public static void move()
	{
		System.out.println("running move in Human");
		walk();
	}
	
	public static void walk()
	{
		System.out.println("running walk in Human");
		run();
	}
	
	public static void run()
	{
		System.out.println("running run in Human");
		eat();
	}
	
	public static void eat()
	{
		System.out.println("running eat in Human");
	}
	
	public static void drink()
	{
		System.out.println("running drink in Human");
	}
}