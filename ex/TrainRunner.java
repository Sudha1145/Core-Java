class TrainRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in TrainRunner");
		Train.book("Majestic","M G Road");
		Train.book("Chikkapete","Rajajinagar",4400.0);
		Train.book("Bangalore","Belgaum",4400.0,1200);
		Train.cancle(1200453);
		Train.cancle("Ballary","Bagalakot");
		
	}
}