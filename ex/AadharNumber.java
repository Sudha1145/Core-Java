//Arrays

class AadharNumber
{
	public static void main(String[] nos)
	{
		long harshitaAadharNo = 950526661131L;
		long ranjitAadharNo = 553390946847L;
		long preranaAadharNo = 806519393488L;
		long ashwiniAadharNo = 982259024150L;
		long sachinAadharNo = 518824725363L;
		
		long[] AadharNumber = {harshitaAadharNo,ranjitAadharNo,preranaAadharNo,ashwiniAadharNo,sachinAadharNo};
		
		int totalNumber = AadharNumber.length;
		
		System.out.println("total no of aadharNo :"+AadharNumber); 
		
		long ref = AadharNumber[3];
		System.out.println("Element at index 3:"+ref);
	}
}
		