class PaintRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in PaintRunner");
		Paint.information("Asian Paints");
		Paint.information("Asian Paints", "Pink");
		Paint.information("Asian Paints", 3900.0);
		Paint.information("Pink","Oil Paint",3900.0);
	}
}