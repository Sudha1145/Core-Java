//1. Store 15 emails in array and print all elements from array

class Emails
{
	public static void main(String[] args)
	{
		String sudhaEmail = "sudhafadi5@gmail.com";
		System.out.println("sudhaEmail:"+sudhaEmail);
		String prajaktaEmail = "praji2@gmail.com";
		System.out.println("prajaktaEmail:"+prajaktaEmail);
		String priyankaEmail = "priyanka123@gmail.com";
		System.out.println("priyankaEmail:"+priyankaEmail);
		String shankarEmail = "shankarvf@gmail.com";
		System.out.println("shankarEmail:"+shankarEmail);
		String priyaEmail = "priyak68@gmail.com";
		System.out.println("priyaEmail :"+priyaEmail );
		String sahanaEmail = "sahanak124@gmail.com";
		System.out.println("sahanaEmail:"+sahanaEmail);
		String varshaEmail = "varshahuchachannavar5@gmail.com";
		System.out.println("varshaEmail:"+varshaEmail);
		String surekhaEmail = "surekha09@gmail.com";
		System.out.println(" surekhaEmail :"+ surekhaEmail);
		String prachiEmail = "prachi1008@gmail.com";
		System.out.println(" prachiEmail :"+ prachiEmail);
		String akhilaEmail = "akhilar123@gmail.com";
		System.out.println("akhilaEmail:"+akhilaEmail);
		String vijayEmail = "vijayfadi@gmail.com";
		System.out.println("vijayEmail:"+vijayEmail);
		String sunandaEmail = "sunandabaligeri@gmail.com";
		System.out.println("sunandaEmail:"+sunandaEmail);
		String laxmiEmail = "laxmivj@gmail.com";
		System.out.println("laxmiEmail:"+laxmiEmail);
		String shreyasEmail = "shreyab145@gmail.com";
		System.out.println("shreyasEmail:"+shreyasEmail);
		String samarthEmail = "sammub24@gmail.com";
		System.out.println("samarthEmail:"+samarthEmail);
		
		
		String[] Emails = {sudhaEmail,prajaktaEmail,priyankaEmail,shankarEmail,priyaEmail,sahanaEmail,varshaEmail,surekhaEmail,prachiEmail,akhilaEmail,vijayEmail,sunandaEmail,laxmiEmail,shreyasEmail,samarthEmail};
		
		int total = Emails.length;
		System.out.println("Total no of Emails:"+ total);
		String ref = Emails[5];
		System.out.println("Element at index 5:"+ref);
	}
}