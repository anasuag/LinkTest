package NewProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by anasgupt on 7/10/2017.
 */
public class FirstScript {
    public static void main(String[] args)
    {
        ProfilesIni profile = new ProfilesIni();
        FirefoxProfile myProfile = profile.getProfile("default");
        WebDriver driver = new FirefoxDriver(myProfile);
    }
}
