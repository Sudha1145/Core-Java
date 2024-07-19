class Country1Runner
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in CountryRunner");
		String[] states ={"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal"};
		Country.state(states);
		
		int[] pincodes ={590001,591304,591102,591201,591307,591309,591123,591317,591126};
		Country.pincode(pincodes);
		
		String[] primeMinisters ={"Jawaharlal Nehru","Gulzarilal Nanda","Lal Bahadur Shastri","Indira Gandhi","Morarji Desai","Charan Singh","Rajiv Gandhi","Vishwanath Pratap Singh","Chandra Shekhar","P. V. Narasimha Rao","Atal Bihari Vajpayee","H. D. Deve Gowda","I. K. Gujral","Manmohan Singh","Narendra Modi"};
		Country.primeMinister(primeMinisters);
		
		String[] cabinetMinisters ={"Narendra Modi","Rajnath Singh","Amit Shah","Nitin Gadkari","Nirmala Sitharaman","S. Jaishankar","Arjun Munda","Smriti Irani","Piyush Goyal","Dharmendra Pradhan","Pralhad Joshi","Narayan Tatu Rane","Sarbananda Sonowal","Mukhtar Abbas Naqvi","Virendra Kumar","Giriraj Singh","Jyotiraditya Scindia","Ramchandra Prasad Singh","Ashwini Vaishnaw","Pashupati Kumar Paras","Gajendra Singh Shekhawat","Kiren Rijiju","Raj Kumar Singh","Hardeep Singh Puri","Mansukh Mandaviya","Bhupender Yadav","Parshottam Rupala","G. Kishan Reddy","Anurag Thakur"};
		Country.cabinetMinister(cabinetMinisters);
		
		String[] politicalParties ={"Indian National Congress","Bharatiya Janata Party","Janata Dal","Karnataka Congress Party","Bahujan Samaj Party"};
		Country.politicalPartie(politicalParties);
		
	}
}