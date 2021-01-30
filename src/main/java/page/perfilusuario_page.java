package page;

import driver.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class perfilusuario_page {

    public driver Driver = null;
    public WebDriver driver = null;
    String codigo = null;

    @FindBy(xpath="//*[@id=\'header\']/div[2]/div/div/nav/div[1]/a")
    WebElement perfusua;
    @FindBy(xpath="//*[@id=\'center_column\']/div/div[1]/ul/li[1]/a/span")
    WebElement ordhist;
    @FindBy(xpath="//*[@id=\"order-list\"]/tbody/tr[1]/td[1]")
    WebElement ordref;

    public perfilusuario_page(driver driver){
        this.Driver=driver;
        PageFactory.initElements(this.Driver.returnDriver(),this);
    }

    public void setPerfusua(){
        perfusua.click();
    }
    public void setOrdhist(){
        ordhist.click();
    }
    public String obtenerorden()
    {
        codigo = ordref.getText();
        System.out.println("el código capturado es: " + codigo);
        return codigo;
    }



}
