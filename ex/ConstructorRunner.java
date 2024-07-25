class ConstructorRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in ConstructorRunner");
		Rupee rupee = new Rupee();
		char ref = rupee.symbol;
		System.out.println("Rupee Symbol:"+ref);
		int ref1 = rupee.coin;
		System.out.println("Rupee coin:"+ref1);
		String ref2 = rupee.currencyName;
		System.out.println("Rupee currencyName:"+ref2);
		
		AirConditioner airConditioner = new AirConditioner();
		String name = airConditioner.companyName;
		System.out.println("AirConditioner companyName:"+name);
		double cost = airConditioner.price;
		System.out.println("AirConditioner price:"+cost);
		int warrantyYears = airConditioner.warrantyYears;
		System.out.println("AirConditioner warrantyYears:"+warrantyYears);
		
		Autorikshaw autoRikshaw = new Autorikshaw();
		int seatingCapacity = autoRikshaw.seatingCapacity;
		System.out.println("Autorikshaw seatingCapacity:"+seatingCapacity);
		double price = autoRikshaw.price;
		System.out.println("Autorikshaw price:"+price);
		String modeOfFules = autoRikshaw.modeOfFules;
		System.out.println("Autorikshaw modeOfFules:"+modeOfFules);
		
		AutoDriver autoDriver = new AutoDriver();
		String name1 = autoDriver.name;
		System.out.println("AutoDriver name:"+name1);
		int age = autoDriver.age;
		System.out.println("AutoDriver age:"+age);
		char gender = autoDriver.gender;
		System.out.println("AutoDriver gender:"+gender);
		
		Rapido rapido = new Rapido();
		String name2 = rapido.driverName;
		System.out.println("Rapido driverName:"+name2);
		double price1 = rapido.price;
		System.out.println("Rapido price:"+price1);
		double appRating = rapido.appRating;
		System.out.println("Rapido appRating:"+appRating);
		
		CabCompany cabCompany = new CabCompany();
		String companyName = cabCompany.companyName;
		System.out.println("cabCompany companyName:"+companyName);
		String vehicleColor = cabCompany.vehicleColor;
		System.out.println("cabCompany color:"+vehicleColor);
		String companyLoc =  cabCompany.companyLoc;
		System.out.println("cabCompany companyLoc:"+companyLoc);
		
		BMTC bMTC = new BMTC();
		String busColor = bMTC.busColor;
		System.out.println("BMTC busColor:"+busColor);
		double price2 = bMTC.price;
		System.out.println("BMTC price:"+price2);
	    String destination = bMTC.destination;
		System.out.println("BMTC destination:"+destination);
		
		FoodDeliveryCompany foodDeliveryCompany = new FoodDeliveryCompany();
		String name3= foodDeliveryCompany.name;
		System.out.println("FoodDeliveryCompany name:"+name3);
		double price3= foodDeliveryCompany.price;
		System.out.println("FoodDeliveryCompany price:"+price3);
		String food = foodDeliveryCompany.food;
		System.out.println("FoodDeliveryCompany food:"+food);
		
		Matrimony matrimony = new Matrimony();
		double membershipFee = matrimony.membershipFee;
		System.out.println("Matrimony membershipFee:"+membershipFee);
		int userCount= matrimony.userCount;
		System.out.println("Matrimony userCount:"+userCount);
		String personName = matrimony.personName;
		System.out.println("Matrimony personName:"+personName);
		matrimony.membershipFee=3000.0;
		System.out.println("Matrimony updated membershipFee:"+matrimony.membershipFee);
		matrimony.userCount=20000;
		System.out.println("Matrimony updated userCount:"+matrimony.userCount);
		matrimony.personName = "Prajakta";
		System.out.println("Matrimony updated personName:"+matrimony.personName);
		
		Application application = new Application();
		int numberOfUsers = application.numberOfUsers;
		System.out.println("Application numberOfUsers:"+numberOfUsers);
	    String appName = application.appName;
		System.out.println("Application appName:"+appName);
	    double averageRating =application.averageRating;
		System.out.println("Application averageRating:"+averageRating);
		application.numberOfUsers = 10000;
		System.out.println("Application updated numberOfUsers:"+application.numberOfUsers);
	    application.appName="Naukari App";
		System.out.println("Application updated appName:"+application.appName);
	    application.averageRating=4.5;
		System.out.println("Application updated averageRating:"+application.averageRating);
		
		Fruit fruit = new Fruit();
		String fruitName = fruit.fruitName;
		System.out.println("Fruit Name:"+fruitName);
	    double cost2 = fruit.price;
		System.out.println("Fruit Cost:"+cost2);
	    int quantity = fruit.quantity;
		System.out.println("Fruit quantity:"+quantity);
		fruit.fruitName="Banana";
		System.out.println("Fruit Name updated:"+fruit.fruitName);
	    fruit.price = 50.0;
		System.out.println("Fruit Cost updated:"+fruit.price);
	    fruit.quantity = 12;
		System.out.println("Fruit quantity updated:"+fruit.quantity);
		
		Place place = new Place();
		String placeName = place.placeName;
		System.out.println("Place Name:"+placeName);
	    double length = place.length;
		System.out.println("Place length:"+length);
		double width = place.width;
		System.out.println("Place width:"+width);
		place.placeName = "Rajajinagar";
		System.out.println("Place Name updated:"+place.placeName );
	    place.length = 54.5;
		System.out.println("Place length updated:"+place.length);
		place.width = 60.5;
		System.out.println("Place width updated:"+place.width);
		
		AlcoholBrand alcoholBrand = new AlcoholBrand();
		String brandName = alcoholBrand.brandName;
		System.out.println("AlcoholBrand name:"+brandName);
		double alcoholPrice = alcoholBrand.alcoholPrice;
		System.out.println("AlcoholBrand price:"+alcoholPrice);
	    int alcoholQuantity = alcoholBrand.alcoholQuantity;
		System.out.println("AlcoholBrand quantity:"+alcoholQuantity);
		alcoholBrand.brandName = "KingFisher";
		System.out.println("AlcoholBrand name updated:"+alcoholBrand.brandName);
		alcoholBrand.alcoholPrice = 1000.0;
		System.out.println("AlcoholBrand price updated:"+alcoholBrand.alcoholPrice);
	    alcoholBrand.alcoholQuantity = 900;
		System.out.println("AlcoholBrand quantity updated:"+ alcoholBrand.alcoholQuantity);
		
		Candy candy = new Candy();
		String candyName = candy.candyName;
		System.out.println("Candy name:"+candyName);
		double candyPrice = candy.candyPrice;
		System.out.println("Candy Price:"+candyPrice);
	    String candyColor = candy.candyColor;
		System.out.println("Candy color:"+candyColor);
		candy.candyName = "Snickers";
		System.out.println("Candy name updated:"+candy.candyName);
		candy.candyPrice = 50.0;
		System.out.println("Candy Price updated:"+candy.candyPrice);
	    candy.candyColor = "orange";
		System.out.println("Candy color updated:"+candy.candyColor );
		
		Medicine medicine = new Medicine();
		String medicineName = medicine.medicineName;
		System.out.println("Medicine name:"+medicineName);
		double medicineCost = medicine.medicineCost;
		System.out.println("Medicine Cost:"+medicineCost);
	    int medicineQuantity =medicine.medicineQuantity;
		System.out.println("Medicine Quantity:"+medicineQuantity);
		medicine.medicineName="Dolo-650";
		System.out.println("Medicine name Updated:"+medicine.medicineName);
	    medicine.medicineCost=10.0;
		System.out.println("Medicine Cost Updated:"+medicine.medicineCost);
	    medicine.medicineQuantity=2;
		System.out.println("Medicine Quantity Updated:"+medicine.medicineQuantity);
		
		System.out.println("End main in ConstructorRunner");
	}
}
		