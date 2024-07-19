class WebCameraRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in WebCameraRunner");
		WebCamera.capture();
		WebCamera.capture("Bird");
	}
}