class Lipstick
{
	public static void brand(String[] brands)
	{
		System.out.println("Start brand in Lipstick");
		for(int position=brands.length-1;position>=0;position--)//backward direction
		{
			String ref=brands[position];
			System.out.println("Brand:"+ref);
		}
		System.out.println("end brand in Lipstick");
			
	}
}