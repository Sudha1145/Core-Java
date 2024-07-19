class ShopRunner
{
	public static void main(String[] juiceInfo)
	{
		if(juiceInfo.length==5)
		{
			String name=juiceInfo[0];
			String brand=juiceInfo[1];
		    String flavour=juiceInfo[2];
			String price=juiceInfo[3];
			String quantity=juiceInfo[4];
			
			double convertedPrice=Double.parseDouble(price);
			double convertedquantity=Double.parseDouble(quantity);
			
			Shop.juiceInfo(name,brand,flavour,convertedPrice,convertedquantity);
		}
	}
}
