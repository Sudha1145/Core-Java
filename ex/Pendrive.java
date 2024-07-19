//Write a class with main method and pass below info

//1. Main to take information of a person: name,email,age,password


class Pendrive
{
	public static void main(String[] personInfos)
	{
		
		if(personInfos.length==4)//To avoid ArrayIndexOutOfBoundException
		{
		String name=personInfos[0];
		String email=personInfos[1];
		String age=personInfos[2];
		String password=personInfos[3];
		
		System.out.println("name:"+name);
		System.out.println("email:"+email);
		System.out.println("age:"+age);
		System.out.println("password:"+password);
		}
		else{
			System.out.println("Not enough information");
		}
	}
}
		
		