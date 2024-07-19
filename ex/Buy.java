class Buy
{
	public static void product(String brand, double price)
	{
		System.out.println("Running product in Buy with one String and one double parameter");
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
	}
	
	public static void product(String name,int quantity,String quality,double price)
	{
		System.out.println("Running product in Buy with two String,one double and one int parameter");
		System.out.println("name:"+name);
		System.out.println("quantity:"+quantity);
		System.out.println("quality:"+quality);
		System.out.println("price:"+price);
	}
	
	public static void bookMovieTicket(String name,String theaterName,int quantity,double price)
	{
		System.out.println("Running product in Buy with two String,one double  and one int parameter");
		System.out.println("name:"+name);
		System.out.println("theaterName:"+theaterName);
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+price);
	}
	
	public static void buyEgg(int total, double pricePerEgg)
	{
		System.out.println("Running product in Buy with one int and one double parameter");
		System.out.println("total:"+ total);
		System.out.println("pricePerEgg:"+pricePerEgg);
	}
	
	public static void buyShampoo(int quantityInMl,double price,String brand,String manfDate)
	{
		System.out.println("Running product in Buy with two String,one double  and one int parameter");
		System.out.println("quantityInMl:"+quantityInMl);
		System.out.println("price:"+price);
		System.out.println("brand:"+brand);
		System.out.println("manfDate:"+manfDate);
	}
	
	public static void buyCake(char size,String type,String flavour,double cost,int quantity)
	{
		System.out.println("Running product in Buy with two String,one double,one int and one char parameter");
		System.out.println("size:"+size);
		System.out.println("type:"+type);
		System.out.println("flavour:"+flavour);
		System.out.println("cost:"+cost);
		System.out.println("quantity:"+quantity);
	}
	
	public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize)
	{
		System.out.println("Running product in Buy with two String,two double  and four int parameter");
		System.out.println("brand:"+brand);
		System.out.println("serialNo:"+serialNo);
		System.out.println("price:"+price);
		System.out.println("batteryCapacity:"+batteryCapacity);
		System.out.println("screenSize:"+screenSize);
		System.out.println("os:"+os);
		System.out.println("harddiskSize:"+harddiskSize);
		System.out.println("ramSize:"+ramSize);
	}
	
	public static void buySmartWatch(String brand,double price,int color,char type,int mode)
	{
		System.out.println("Running product in Buy with one String,one double,two int and one char parameter");
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("color:"+color);
		System.out.println("type:"+type);
		System.out.println("mode:"+mode);
	}	
	
}