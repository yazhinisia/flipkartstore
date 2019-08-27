package purchase1;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginobject extends basepage {
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/a[@title='Women']")
	private WebElement Women;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a[text()='Dresses']")
	private WebElement Dress;
	
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[3]/a[@title='T-shirts']")
	private WebElement Tshirt;
	
	@FindBy(xpath="//*[@class='form-group']/*[@id='newsletter-input']")
	private WebElement Newsletter;
	
	@FindBy(xpath="//*[@id='newsletter_block_left']/div[1]//*[@name='submitNewsletter']")
	private WebElement Button;
	
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']/li[1]/label/a")
	private WebElement s_size;
	
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']/li[2]/label/a")
	private WebElement m_size;
	
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']/li[3]/label/a")
	private WebElement l_size;
	
	
	public loginobject()
	{
		PageFactory.initElements(driver, this);
	
	}
	public WebElement getWomen() {
		return Women;
		
		}
	public WebElement getDress() {
		return Women;
		
		}
	public WebElement getTshirt() {
		return Tshirt;
		
		}
	public WebElement getNewsletter() {
		return Newsletter;
		
		}
	
	public WebElement getButton() {
		return Button;
	}
	
/*	public WebElement SizeDisplay() {
		return ;
		
		}
	
	public WebElement getWomen() {
		return Women;
		
		}
	
	public WebElement getWomen() {
		return Women;*/
		
		
	public String Womenclick()
	{
		Women.click();
		return getTitle();
	}
	public String Dressclick()
	{
		Dress.click();
		return getTitle();
}
	public String Tshirtclick()
	{
		Tshirt.click();
		return getTitle();
	
	}
	
	public void Newsletter() {
		int random=new Random().nextInt(40000);
		String name="sia"+ random + "@gmail.com";
		Newsletter.sendKeys(name);
		Button.click();
		System.out.println(Newsletter.getAttribute("value"));
	}
		
	}
	
	
	