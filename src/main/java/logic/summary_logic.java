package logic;

import driver.driver;
import page.summary_page;

public class summary_logic {
    driver Driver = null;
    summary_page sm = null;

    public summary_logic(driver driver){
        this.Driver = driver;
        sm = new  summary_page (driver);
    }
     public void summnarynext(){
        sm.setBtncarrito();
        sm.setChecksummary();
     }

}
