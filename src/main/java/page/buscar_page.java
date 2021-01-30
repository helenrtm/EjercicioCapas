package page;


import driver.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class buscar_page {
public driver Driver = null;
public WebDriver driver = null;

@FindBy(id="search_query_top")
    WebElement prodBus;

@FindBy(name = "submit_search")
    WebElement btnbus;

public buscar_page (driver driver){
this.Driver = driver;
    PageFactory.initElements(this.Driver.returnDriver(),this);

}
public void setprodBus(String prodBuscar){
    Driver.implicitwait();
prodBus.sendKeys(prodBuscar);

}

    public void setBtnbus(){
        btnbus.click();
    }

}
