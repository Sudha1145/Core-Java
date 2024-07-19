class SteelRunner
{
	public static void main (String[] args)
	{
		
		System.out.println("Running main in SteelRunner");
		double medicineName = Steel.price("paracetamol");
		System.out.println("medicineName :"+medicineName);
		medicineName= Steel.price("Tylenol");
		System.out.println("medicineName :"+medicineName);
	    medicineName= Steel.price("aspirin");
		System.out.println("medicineName:"+medicineName);
		
		String symptom = Steel.medicineName("fever");
		System.out.println("symptom :"+symptom);
	    symptom = Steel.medicineName( "cough");
		System.out.println("symptom :"+symptom);
		symptom = Steel.medicineName("BodyPain");
		System.out.println("symptom :"+symptom);
		
		int doctorName  = Steel.availability ("Dr.Prabhu");
		System.out.println("doctorName:"+doctorName);
		doctorName  = Steel.availability ("Dr.S. V. Patil");
		System.out.println("doctorName:"+doctorName);
		doctorName = Steel.availability ("Dr.Prajakta pawar");
		System.out.println("doctorName:"+doctorName);	
	}
}
	