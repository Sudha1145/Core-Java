class Room
{
	public static void bed()
	{
		System.out.println("running bed in Room");
	}
	
	public static void chair()
	{
		System.out.println("running chair in Room");
	}
	
	public static void main(String[] args)
	{
		System.out.println("running main in Room");
		Room.bed();
		Room.chair();
	}
}