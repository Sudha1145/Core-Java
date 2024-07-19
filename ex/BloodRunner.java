class BloodRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in BloodRunner");
		String value = Blood.group();
		System.out.println("value:"+value);
		
		String name = Blood.personName();
		System.out.println("name:"+name);
		
		double price = Blood.cost();
		System.out.println("price:"+price);
		
		String hospitalTested= Blood.hospitalTested();
		System.out.println("hospitalTested:"+hospitalTested);
		
		String sickness= Blood.sickness();
		System.out.println("sickness:"+sickness);
		
		String donate= Blood.donate();
		System.out.println("donate:"+donate);
		
	}
}