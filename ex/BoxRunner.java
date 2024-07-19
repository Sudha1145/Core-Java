class BoxRunner
{
	public static void main (String[] args)
	{
		System.out.println("Running main in BoxRunner");
		String code = Box.Country("United States");
		
	    code = Box.Country("France");
		System.out.println("code :"+code);
		code= Box.Country("Germany");
		System.out.println("code :"+code);
		code = Box.Country("Japan");
		System.out.println("code :"+code);
		code = Box.Country("China");
		System.out.println("code :"+code);
		
		double price = Box.getItem("Kaju Kadai");
		System.out.println("price :"+price);
		price = Box.getItem("Roti");
		System.out.println("price :"+price);
	    price = Box.getItem("FriedRice");
		System.out.println("price :"+price);
		price = Box.getItem("PavBhaji");
		System.out.println("price :"+price);
		price = Box.getItem("Panipuri");
		System.out.println("price :"+price);
		
		String producerName = Box. getMovieName("Pogaru");
		System.out.println("producerName :"+producerName);
		producerName = Box. getMovieName("KGF");
		System.out.println("producerName :"+producerName);
		producerName = Box. getMovieName("Kotigobba");
		System.out.println("producerName :"+producerName);
		producerName = Box. getMovieName("LoveMockTail");
		System.out.println("producerName :"+producerName);
		producerName = Box. getMovieName("Power");
		System.out.println("producerName :"+producerName);
		
	}
}
		
 