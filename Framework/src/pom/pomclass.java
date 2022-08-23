package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomclass {
@FindBy(id="email")
private WebElement username;
@FindBy (id="pass")
 private WebElement password;
@FindBy(name="login")
private WebElement loginbut;
public pomclass(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void user(String value1)
{
	username.sendKeys(value1);
}
public void pass(String value2)
{
	password.sendKeys(value2);
}
public void login()
{
	loginbut.click();
}
}
