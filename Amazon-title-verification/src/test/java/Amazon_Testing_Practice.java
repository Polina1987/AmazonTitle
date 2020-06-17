import org.junit.Assert;
import org.testng.annotations.Test;

public class Amazon_Testing_Practice extends Driver{
	
	public static void main(String[] args) {
		new Amazon_Testing_Practice().myMethod();
	}
	
	@Test
	public void myMethod() {
		driver.get("https://www.amazon.com/");
		String title = driver.getTitle();
		Assert.assertEquals( "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs &amp; more", title);
	}

}
