class DeliveryGuy
{
	public static void deliver(String item)
	{
		System.out.println("Running deliver in company with one String parameter");
		System.out.println("item:"+item);
		DeliveryVehicle.deliver("pizza","Bangalore");
	}
}