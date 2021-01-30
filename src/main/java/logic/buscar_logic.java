package logic;

import driver.driver;
import page.buscar_page;

public class buscar_logic {
driver Driver = null;
buscar_page buspag = null;

    public buscar_logic(driver driver){
        this.Driver = driver;
        buspag = new buscar_page(Driver);

    }
    public void Buscar (String prod){
        buspag.setprodBus (prod);
        buspag.setBtnbus();
    }
}
