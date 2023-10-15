package Settings;
import io.cucumber.java.Before;
import static Settings.DriverFactory.getDriver;
public class Hooks {
    @Before
    public void setup() {
        getDriver();
    }
}
