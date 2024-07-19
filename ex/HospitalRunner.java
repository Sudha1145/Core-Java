class HospitalRunner
{
	public static void main(String[] medicineInfo)
	{
		if (medicineInfo.length == 4)
		{
			
			String name = medicineInfo[0];
			String manfDate = medicineInfo[1];
			String price =medicineInfo[2];
			String quantity = medicineInfo[3];
			
		double convertedPrice= Double.parseDouble(price);
		double convertedQuantity= Double.parseDouble(quantity);
		
		
		Hospital.medicineInfo(name,manfDate,convertedPrice,convertedQuantity);
		} 
	}
		
}