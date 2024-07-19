//Declare country class with Below methods
//1. Method to take states: String[] : 29
//2. Methos to take pincode: int[]: 10
//3. Method to take primeminister:String[]: All
//4. Method to take Cabinetministers:String[]: 30
//5. Method to take political parties:String[]: 5
//Above methods print in backward direction


class Country1
{
	public static void stateBackward(String[] states)
	{
		System.out.println("Start states in Country");
		for(int position=states.length-1;position>=0;position--)
		{
			String ref=states[position];
			System.out.println("State:"+ref);
		}
		System.out.println("End states in Country");
			
	}
	
	public static void pincodeBackward(int[] pincodes)
	{
		System.out.println("Start pincode in Country");
		for(int position=pincodes.length-1;position>=0;position--)
		{
			int ref=pincodes[position];
			System.out.println("pincode:"+ref);
		}
		System.out.println("End pincode in Country");
			
	}
	
	public static void primeMinisterBackward(String[] primeMinisters)
	{
		System.out.println("Start primeMinister in Country");
		for(int position=primeMinisters.length-1;position>=0;position--)
		{
			String ref=primeMinisters[position];
			System.out.println("primeMinister:"+ref);
		}
		System.out.println("End primeMinister in Country");
			
	}
	
	public static void cabinetMinisterBakward(String[] cabinetMinisters)
	{
		System.out.println("Start cabinetMinister in Country");
		for(int position=cabinetMinisters.length-1;position>=0;position--)
		{
			String ref=cabinetMinisters[position];
			System.out.println("cabinetMinister:"+ref);
		}
		System.out.println("End cabinetMinister in Country");
			
	}
	
	public static void politicalPartieBackward(String[] politicalParties)
	{
		System.out.println("Start politicalParties in Country");
		for(int position=politicalParties.length-1;position>=0;position--)
		{
			String ref=politicalParties[position];
			System.out.println("politicalParties:"+ref);
		}
		System.out.println("End politicalParties in Country");
			
	}
	
}

