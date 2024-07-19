//B. Write a class with below methods
//1.Method to take medicineName and return price : 3 condition
//2.Method to take symptom and return medicineName: 3 condition
//3.Method to take doctor name and return availability:3 condition
class Steel
{
	public static double price (String medicineName)
	{
		System.out.println("Running price in Steel");
		System.out.println("medicineName:"+medicineName);
		if (medicineName == "paracetamol")
		{
			return 10;
		}
		if (medicineName == "Tylenol")
		{
			return 15;
		}
		if (medicineName == "aspirin")
		{
			return 5;
		}
		else{
			 
			 return 0;
		}
	}
	public static String medicineName (String symptom)
	{
		System.out.println("Running medicineName in Steel");
		System.out.println("symptom:"+symptom);
		if (symptom== "fever")
		{
			return "paracetamol";
		}
		if (symptom== "cough")
		{
			return "coricidin";
		}
		if (symptom== "BodyPain")
		{
			return "cyclooxygenase";
		}
		else{
			 return "not found" ;
		}
	}
	public static int availability (String doctorName)
	{
		System.out.println("Running availability in Steel");
		System.out.println("doctorName:"+doctorName);
		if (doctorName == "Dr.Prabhu")
		{
			return 5;
		}
		if (doctorName == "Dr.S. V. Patil")
		{
			return 7;
		}
		if (doctorName == "Dr.Prajakta pawar")
		{
			return 5;
		}
		else{
			return 0;
		}	
	}
}