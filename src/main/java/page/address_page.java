package page;

import driver.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class address_page {
    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(xpath="//*[@id='center_column']/form/p/button/span")
    WebElement btnaddress;

    public address_page( driver driver) {
        this.Driver=driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);

    }

    public void setBtnaddress (){
        btnaddress.click();
    }
}
