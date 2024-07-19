class ChainRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in ChainRunner");
		int value = Chain.carat();
		System.out.println("value:"+value);
		
		int price = Chain.costPerGram();
		System.out.println("price:"+price);
		
		String type = Chain.type();
		System.out.println("type:"+type);
		
		String quality = Chain.quality();
		System.out.println("quality:"+quality);
		
		double quantity = Chain.quantity();
		System.out.println("quantity:"+quantity);
		
		boolean wastage = Chain.wastage();
		System.out.println("wastage:"+wastage);
		
		int cost = Chain.serviceCharge();
		System.out.println("cost:"+cost);
		
		double gst = Chain.gst();
		System.out.println("gst:"+gst);
		
		
	}
}