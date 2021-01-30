package logic;

import driver.driver;
import page.perfilusuario_page;

public class perfilusuario_logic {

    driver Driver = null;
    perfilusuario_page perusu = null;

    public perfilusuario_logic(driver driver){
        this.Driver=driver;
        perusu = new perfilusuario_page(driver);
    }
    public void perusuhist(){
        perusu.setPerfusua();
        perusu.setOrdhist();
        perusu.obtenerorden();

    }



}
