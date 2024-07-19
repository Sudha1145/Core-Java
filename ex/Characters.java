//2. Store 20 characters in array and print all elements from array

class Characters
{
	public static void main(String[] args)
	{
		char grade = 'B'; //A single letter grade (e.g., 'A')
		System.out.println("grade:"+grade);
		char gender = 'F'; //A single character representing gender (e.g.,'F' for female)
		System.out.println("gender:"+gender);
		char direction = 'N';//Cardinal directions (e.g., 'N' for north)
		System.out.println("direction:"+direction);
		char initial = 'F';//The initial of a person's first or last name (e.g.,'F')
		System.out.println("initial:"+initial);
		char response = 'Y';//A single character response (e.g., 'Y' for yes)
		System.out.println("response:"+response);
		char symbol = '@';//A single special character (e.g., '@')
		System.out.println("symbol :"+symbol );
		char nucleotide = 'A';//A single DNA nucleotide (e.g., 'A' for adenine)
		System.out.println("nucleotide:"+nucleotide);
		char bloodType = 'O';//A single character for blood type (e.g., 'O')
		System.out.println("bloodType :"+bloodType );
		char chessPiece = 'Q';//Initial of a chess piece (e.g.,'Q' for queen)
		System.out.println("chessPiece:"+chessPiece);
		char operation = '+';//A mathematical operation (e.g., '+' for addition)
		System.out.println("operation :"+operation );
		char gradeLevel = 'K';//A single character representing grade level (e.g., 'K' for kindergarten)
		System.out.println("gradeLevel:"+gradeLevel);
		char eyeColor = 'B';//A single character representing eye color (e.g., 'B' for blue)
		System.out.println("eyeColor:"+eyeColor);
		char trafficSignal = 'G';// A single character for traffic signals (e.g.,'G' for green)
		System.out.println("trafficSignal:"+trafficSignal);
		char currencySymbol= '$';//A single character for currency (e.g.,'$' for dollars)
		System.out.println("currencySymbol:"+currencySymbol);
		char menuOption = '1';//A single character for a menu choice (e.g., '1')
		System.out.println("menuOption:"+menuOption);
		char maritalStatus = 'S';// A single character for marital status (e.g., 'S' for single)
		System.out.println("maritalStatus:"+maritalStatus);
		char gradeSymbol = 'P';// A single character representing pass/fail (e.g., 'P' for pass)
		System.out.println("gradeSymbol:"+gradeSymbol);
		char size = 'L';// A single character representing clothing size (e.g., 'L' for large)
		System.out.println("size:"+size);
		char userStatus = 'I';//A single character for online status (e.g.,'I' for inactive)
		System.out.println("userStatus:"+userStatus);
		char airportTerminal = 'T';// A single character for terminal designation (e.g., 'T')
		System.out.println("airportTerminal:"+airportTerminal);
		
		char[] Characters = {grade,gender,direction,initial,response,symbol,nucleotide,bloodType,chessPiece,operation,gradeLevel,eyeColor,trafficSignal,currencySymbol,menuOption,maritalStatus,gradeSymbol,size,userStatus,airportTerminal};
		int total = Characters.length;
		System.out.println("Total no of Characters:"+total);
		char ref = Characters[10];
		System.out.println("Element at index 10:"+ref);	
		
	}
}