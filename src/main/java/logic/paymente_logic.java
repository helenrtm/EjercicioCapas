package logic;

import driver.driver;
import page.payment_page;


public class paymente_logic {

    driver Driver = null;
    payment_page ppa = null;

    public paymente_logic(driver driver){
        this.Driver = driver;
        ppa = new payment_page(driver);
    }
    public void paymentfin() {
        ppa.setBankwire();
        ppa.setBtnconfir();
        ppa.obtenerpedido();
    }

}
