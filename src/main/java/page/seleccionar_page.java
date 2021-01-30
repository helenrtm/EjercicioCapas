package page;

import driver.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class seleccionar_page {
    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(xpath="//*[@id='best-sellers_block_right']/div/ul/li[1]/a/img")
    WebElement selprod;
    @FindBy(xpath= "//*[@id=\'quantity_wanted_p\']/a[2]/span/i")
    WebElement cantProd;

    @FindBy(id = "group_1")
    WebElement cboseltall;

    @FindBy(xpath="//*[@id=\'add_to_cart\']/button/span")
    WebElement btncart;

    @FindBy(xpath="//*[@id=\'layer_cart\']/div[1]/div[2]/div[4]/a/span")
    WebElement btnproccheck;

    @FindBy(xpath="//*[@id=\'columns\']/div[1]/a/i")
    WebElement home;



    public seleccionar_page(driver driver){
        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(),this);
    }

    public void setSelprod(){
        selprod.click();
    }
    public void setCantProd(){
        Driver.customWait_clickable(cantProd);
        cantProd.click();
        cantProd.click();
    }

    public void setCboseltalll(String tall){
        cboseltall.sendKeys(tall);

    }
    public void setBtncart(){
    Driver.customWait_clickable(btncart);
    btncart.click();
    }

    public void setProccheck(){
        Driver.customWait_clickable(btnproccheck);
        btnproccheck.click();
    }

    public void setHome(){
    Driver.customWait_clickable(home);
    home.click();
    }
}
