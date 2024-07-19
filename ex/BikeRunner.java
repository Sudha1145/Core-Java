class BikeRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in BikeRunner");
		String cost = Bike.bike(100);
		System.out.println("cost :"+cost);
		Bike.bike("heroHonda");
		
	}

}