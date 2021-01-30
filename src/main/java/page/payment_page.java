package page;
import driver.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class payment_page {
    public driver Driver = null;
    public WebDriver driver = null;
    public String pedido = null;


    @FindBy(xpath= "//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")
    WebElement bankwire;

    @FindBy(xpath="//*[@id='cart_navigation']/button/span")
    WebElement btnconfir;

    @FindBy(xpath = "//*[@id='center_column']/div")
    WebElement captped;

    public payment_page( driver driver) {
        this.Driver=driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);

    }

    public void setBankwire () {
        Driver.customWait_clickable(bankwire);
        bankwire.click();
    }

    public void setBtnconfir (){
        Driver.customWait_clickable(btnconfir);
        btnconfir.click();
    }

    public String obtenerpedido()
    {
        pedido = captped.getText();
        System.out.println("el pedido es: " + pedido);
        return pedido;
    }
}
