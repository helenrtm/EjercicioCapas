package logic;

import driver.driver;
import page.buscar_page;
import page.seleccionar_page;

public class seleccionar_logic {
driver Driver = null;
seleccionar_page sl = null;

    public seleccionar_logic(driver driver){
        this.Driver = driver;
        sl = new seleccionar_page(Driver);

    }

public void seleccionar(String talla){
        sl.setSelprod();
        sl.setCantProd();
        sl.setCboseltalll(talla);
        sl.setBtncart();
        sl.setProccheck();
        sl.setHome();



}

}
