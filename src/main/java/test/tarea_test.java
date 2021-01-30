package test;

import driver.driver;
import logic.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class tarea_test {
 driver Driver = null;
login_logic loglog1 = null;
landig_logic lanlog1 = null;
buscar_logic buslog1 = null;
seleccionar_logic sellog1 = null;
summary_logic sumlog1 = null;
address_logic addlog1 = null;
shipping_logic shiplog1 = null;
paymente_logic paylog1 = null;
perfilusuario_logic perlog1 = null;

@BeforeClass
    public void ejecutaTest(){
 Driver = new driver();
loglog1 = new login_logic(Driver);
lanlog1 = new landig_logic(Driver);
buslog1 = new buscar_logic(Driver);
sellog1 = new seleccionar_logic(Driver);
sumlog1 = new summary_logic(Driver);
addlog1 = new address_logic(Driver);
shiplog1 = new shipping_logic(Driver);
paylog1 = new paymente_logic(Driver);
perlog1 = new perfilusuario_logic(Driver);
}

@Test(priority=1,testName="Test1")
public void testTest1() throws InterruptedException{
Driver.goto_url("http://automationpractice.com");
lanlog1.SingIn();
loglog1.login("helen@gmail.com","h12345");
buslog1.Buscar("Faded Short Sleeve T-shirts");
sellog1.seleccionar("M");
sumlog1.summnarynext();
addlog1.addressnext();
shiplog1.shippingnext();
paylog1.paymentfin();
perlog1.perusuhist();
}

    @AfterClass
    public void teardown() {
        Driver.teardown();
    }


}
