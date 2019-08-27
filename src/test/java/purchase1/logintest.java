package purchase1;



import org.testng.Assert;
import org.testng.annotations.Test;

public class logintest {

	loginobject loginpage;
	basepage bp;

	public logintest() {
		loginpage = new loginobject();
		bp = new basepage();
	}

	@Test
	public void verifyWomenText() {
		Assert.assertTrue(loginpage.getWomen().isDisplayed());
	}


	@Test
	public void verifyDress() {
		Assert.assertTrue(loginpage.getDress().isDisplayed());
	}

	@Test
	public void verifyTshirt() {
		Assert.assertTrue(loginpage.getTshirt().isDisplayed());
	}
	
	@Test
	public void verifyNewslettr() {
		loginpage.Newsletter();

	}
	
	@Test
	public void verifyButton() {
		loginpage.getButton();

	}
	
    @Test
	public void getTitles() {
		System.out.println(loginpage.Womenclick());
		System.out.println(loginpage.Dressclick());
		System.out.println(loginpage.Tshirtclick());
		


    }
	
	
	
}
	


	

