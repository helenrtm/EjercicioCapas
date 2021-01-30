package logic;

import driver.driver;
import page.address_page;
import page.shipping_page;

public class shipping_logic {

    driver Driver = null;
    shipping_page spa = null;

    public shipping_logic(driver driver){
        this.Driver = driver;
        spa = new shipping_page(driver);
    }
    public void shippingnext(){
        spa.setCheckshipping();
        spa.setBtnshipping();
    }
}
