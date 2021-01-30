package page;

import driver.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shipping_page {

    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(id = "cgv")
    WebElement checkshipping;

    @FindBy(xpath="//*[@id='form']/p/button/span")
    WebElement btnshipping;

    public shipping_page( driver driver) {
        this.Driver=driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);

    }

    public void setCheckshipping () {
        checkshipping.click();
    }

    public void setBtnshipping ()
    {
        btnshipping.click();
    }
}
