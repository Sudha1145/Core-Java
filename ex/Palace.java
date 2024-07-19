//3. Main to take information of a palace: name,location,builtBy,buildYear

class Palace
{
	public static void main(String[] palaceInfos)
	{
		if (palaceInfos.length == 4)
		{
			
			String name = palaceInfos[0];
			String location = palaceInfos[1];
			String builtBy = palaceInfos[2];
			String buildYear = palaceInfos[3];
			
			System.out.println("name:"+name);
			System.out.println("location:"+location);
			System.out.println("builtBy:"+builtBy);
			System.out.println("buildYear:"+buildYear);
		} 
		else{
			System.out.println("Not enough information");
		}
	}
}
		