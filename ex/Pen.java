class Pen
{
	public static void main(String[] args)
	{
		phone();
		area();
		india();
		southAfrica();
	}
	
	public static void phone()
	{
		String chat = "Send a message";
		System.out.println("chat:"+chat);
		
		String message = "receive a message";
		System.out.println("message:"+ message);
		
		boolean seenMsg= true;
		System.out.println("seenMsg:"+ seenMsg);
		
		boolean readMsg = true;
		System.out.println("readMsg:"+ readMsg);
		
		boolean writeMsg = false;
		System.out.println("writeMsg:"+writeMsg);
	}
	
	public static void area()
	{
		double length = 5.5;
		System.out.println("length of area:"+length);
		
		char direction = 'R';
		System.out.println("direction of area:"+direction);
		
		//reassign
		length = 6.5;
		
	}
	
	public static void india()
	{
		System.out.println("Score of India players in T20 world cup");
		int rohitSharma = 9;
		System.out.println("rohitSharma:"+rohitSharma);
		
		int viratKohli = 74;
		System.out.println("viratKohli:"+viratKohli);
		
		int suryaKumarYadav = 3;
		System.out.println("suryaKumarYadav:"+suryaKumarYadav);
		
		int rishabhPant = 0;
		System.out.println("rishabhPant:"+rishabhPant);
		
		int axarpatel = 47;
		System.out.println("axarpatel:"+axarpatel);
		
		int shivamDube = 27;
		System.out.println("shivamDube:"+shivamDube);
		
		int hardikPandya = 5;
		System.out.println("hardikPandya:"+hardikPandya);
		
		int ravindraJadeja = 2;
		System.out.println("ravindraJadeja:"+ravindraJadeja);	
	}
	
	public static void southAfrica()
	{
		System.out.println("Score of South Africa players in T20 world cup");
		int reezaHendricks = 4;
		System.out.println("reezaHendricks:"+reezaHendricks);
		
		int quitonDeKock = 39;
		System.out.println("quitonDeKock:"+quitonDeKock);
		
		int aidenMarkram = 4;
		System.out.println("aidenMarkram:"+aidenMarkram);
		
		int tristanStubbs = 31;
		System.out.println("tristanStubbs:"+tristanStubbs);
		
		int heinrichKlaasen = 52;
		System.out.println("heinrichKlaasen:"+heinrichKlaasen);
		
		int davidMiller = 21;
		System.out.println("davidMiller:"+davidMiller);
		
		int marcoJansen = 2;
		System.out.println("marcoJansen:"+marcoJansen);
		
		int keshavMaharaj = 2;
		System.out.println("keshavMaharaj:"+keshavMaharaj);
		
		int kagisoRabada = 4;
		System.out.println("kagisoRabada:"+kagisoRabada);
		
		int anrichNortje= 1;
		System.out.println("anrichNortje:"+anrichNortje);
		
	}		
}