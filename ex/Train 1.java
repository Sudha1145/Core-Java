// 1.Explain method with return as the last statement with return type
// 2.Explain method without return as the last statement with return type
// 3.Use return with void type

class Train1
{
	public static int book(boolean withBookTickect)
	{
		if(withBookTickect)
		{
			return 100;
		}
		else
		{
			return -100;
		}
		//return is not requied
	}
	
	public static String movie(double cost)
	{
		if(cost>0)
		{
			return "Power";
		}
		else if(cost<=50 && cost>0)
		{
			return "Koti";
		}
		return "Kalki";//it requide 
	}
	public static void product( String name)
	{
		if(name=="Computer")
		{
			System.out.println("Computer runing in product");
			return; //end the statement
		}
		else
		{
			System.out.println("not found");
			return;
		}
	}
}