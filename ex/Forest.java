//2. Main to take information of a forest: name,area,establishedYear,state

class Forest
{
	public static void main(String[] forestInfos)
	{
		
		if(forestInfos.length==4)//To avoid ArrayIndexOutOfBoundException
		{
		String name=forestInfos[0];
		String area=forestInfos[1];
		String establishedYear=forestInfos[2];
		String state=forestInfos[3];
		
		System.out.println("name:"+name);
		System.out.println("area:"+area);
		System.out.println("establishedYear:"+establishedYear);
		System.out.println("state:"+state);
		}
		else{
			System.out.println("Not enough information");
		}
	}
}
		