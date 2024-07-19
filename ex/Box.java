//A.Write a class with below methods
//1.Method to take code and return country: 5 condition
//2.Method to take item and return price: 5 condition
//3.Method to take movie name and return produer name:5 condition

class Box
{
	public static String Country (String code)
	{
		System.out.println("Running Country in Box");
		System.out.println("code:"+code);
		if (code == "US")
		{
			return "United States";
		}
		if (code == "FR")
		{
			return "France";
		}
		if (code == "DE")
		{
			return "Germany";
		}
		if (code == "JP")
		{
			return "Japan";
		}
		if (code == "CN")
		{
			return "China";
		}
		else{
			 
			 return "not found";
		}
		
	}
	
	public static double getItem(String item)
	{
		System.out.println("Running getItem in Box");
		System.out.println("item:"+item);
		if (item == "Kaju Kadai")
		{
			return 150;
		}
		if (item == "Roti")
		{
			return 60;
		}
		if (item == "FriedRice")
		{
			return 200;
		}
		if (item == "PavBhaji")
		{
			return 100;
		}
		if (item == "Panipuri")
		{
			return 30;
		}
		else{
			 
			 return 0;
		}
	}
	
	public static String getMovieName(String movieName)
	{
		System.out.println("Running getMovieName in Box");
		System.out.println("movieName:"+movieName);
		if (movieName == "Pogaru")
		{
			return "B K Gangadhar";
		}
		if (movieName == "KGF")
		{
			return "Vijay Kiragandur";
		}
		if (movieName == "Kotigobba")
		{
			return "R Jagadish";
		}
		if (movieName == "LoveMockTail")
		{
			return "Krishna and Milana Nagaraj";
		}
		if (movieName == "Power")
		{
			return "Rockline Venkatesh";
		}
		else{
			 
			 return "not found";
		}
	}
		
		
		
}