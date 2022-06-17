
public class TestSele {

public void get(String url)
{
	System.out.println("Url is :"+url);
}

public void close()
{
	System.out.println("Exit code");
	System.exit(0);
	
}

public String findElement(String string)
{
	return string;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start Selenium code");
		TestSele driver = new TestSele();
		driver.get("https://google.com");
		
		System.out.println("END Selenium code");
		String msg=driver.findElement(BY.id("Hai"));

		System.out.println("Expected msg is Hai" );
		System.out.println("Actual msg is " +msg);
		
		driver.close();
		

	}

}
