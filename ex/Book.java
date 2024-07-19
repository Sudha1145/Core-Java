class Book
{
	public static void write()
	{
		System.out.println("running write in Book");
		read();
	}
	
	public static void read()
	{
		System.out.println("running read in Book");
		write();
	}
}