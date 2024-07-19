class DeliveryVehicle
{
	public static void deliver(String item,String location)
	{
		System.out.println("Running deliver in company with two String parameter");
		System.out.println("item:"+item);
		System.out.println("location:"+location);
		Company.deliver("Burger","Bangalore");
	}
}