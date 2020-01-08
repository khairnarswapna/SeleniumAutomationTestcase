import org.testng.annotations.Test;

public class SecondTest {

    @Test(priority = 1)
    public void setup() {
        System.out.println("opening browser");
    }

    @Test(priority = 3)
    public void searchCustomer() {
        System.out.println("This is search for customer");
    }
    @Test(priority = 3)
    public void addCustomer() {
        System.out.println("This is add for customer");
    }

    @Test(priority = 2)
    public void tearDown() {
        System.out.println("Closing Brower.");
    }
}
