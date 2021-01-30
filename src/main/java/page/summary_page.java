package page;

import driver.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class summary_page {
    public driver Driver = null;
    public WebDriver driver = null;
    @FindBy(xpath="//*[@id=\'header\']/div[3]/div/div/div[3]/div/a")
    WebElement btncarrito;

    @FindBy(xpath="//*[@id='center_column']/p[2]/a[1]/span")
    WebElement checksummary;

    public summary_page( driver driver){
        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(),this);

    }

    public void setBtncarrito(){
        btncarrito.click();
    }

    public void setChecksummary(){
        checksummary.click();
    }

}
