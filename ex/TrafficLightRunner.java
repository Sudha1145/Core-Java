class TrafficLightRunner
{
	public static void main(String[] trafficInfos)
	{
		
		if(trafficInfos.length==3)//To avoid ArrayIndexOutOfBoundException
		{
		String location=trafficInfos[0];
		String automatic=trafficInfos[1];
		String working=trafficInfos[2];
		
		System.out.println("location:"+location);
		System.out.println("automatic:"+automatic);
		System.out.println("working:"+working);
		}
		else{
			System.out.println("Not enough information");
		}
	}
}
		
		