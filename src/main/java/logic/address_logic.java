package logic;

import driver.driver;
import page.address_page;
import page.summary_page;

public class address_logic {

    driver Driver = null;
    address_page ap = null;

    public address_logic(driver driver){
        this.Driver = driver;
        ap = new address_page(driver);
    }
    public void addressnext(){
        ap.setBtnaddress();
    }

}
