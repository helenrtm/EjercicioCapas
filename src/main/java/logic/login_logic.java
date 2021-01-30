package logic;

import driver.driver;
import page.login_page;

public class login_logic {

    driver Driver = null;
    login_page lp = null;

public login_logic(driver driver){
this.Driver =driver;
lp = new login_page(Driver);
}

public void login(String idEmail, String password){
lp.setEmail(idEmail);
lp.setPasswd(password);
lp.setBtnSignIn();

}
}
