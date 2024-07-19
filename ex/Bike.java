class Bike
{
	public static String bike(int cost)
	{
		if(cost>100)
		{
			return "true";
		}
		else if(cost<=100)
		{
			return "False";
		}
		else{
			return "not found";
		}
	
	}
	
	public static void bike(String bikeBrand)
	{
	System.out.println("bikeBrand:"+bikeBrand);
	
	}
	

}