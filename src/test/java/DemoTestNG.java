import org.testng.annotations.Test;

public class DemoTestNG {

    @Test(priority = 1)
    public void setup() {
        System.out.println("opening browser");
    }

    @Test(priority = 3)
    public void login() {
        System.out.println("This is login Test");
    }

    @Test(priority = 2)
    public void tearDown() {
        System.out.println("Closing Brower.");
    }
}
