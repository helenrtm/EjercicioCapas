package logic;

import driver.driver;
import page.landing_page;

public class landig_logic {

driver Driver = null;
landing_page lanpag = null;

public landig_logic (driver driver) {
this.Driver = driver;
lanpag = new landing_page(Driver);
}

public void  SingIn(){
lanpag.SignIn();
}
}
