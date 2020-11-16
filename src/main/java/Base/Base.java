package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {

public static WebDriver driver;


    public static  WebDriver getdiver() throws IOException {
	
	
	Properties prop= new Properties();

	FileInputStream fis= new FileInputStream("C:\\Users\\ercan\\eclipse-workspace\\Cucumber\\src\\main\\java\\properties\\GN.properties");
	prop.load(fis);
	String s=prop.getProperty("browser");
	// TODO Auto-generated method stub
	if (s.toString().equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ercan\\Driver\\Gecodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	if (s.toString().equalsIgnoreCase("ei")) {

		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);

		System.setProperty("webdriver.ie.driver", "C:\\Users\\ercan\\Driver\\IEDriver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver(capabilities);

	}
	if (s.toString().equalsIgnoreCase("chrome")) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ercan\\Driver\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	if (s.toString().equalsIgnoreCase("edge")) {

		System.setProperty("webdriver.ei.driver", "C:\\Users\\ercan\\Driver\\Edge\\MicrosoftWebDriver.exe");
		driver = new EdgeDriver();

	}
	if (s.toString().equalsIgnoreCase("opera")) {
		DesiredCapabilities  capabilities = new DesiredCapabilities();
		OperaOptions options= new OperaOptions();
		options.setBinary("C:\\Users\\ercan\\AppData\\Local\\Programs\\Opera\\72.0.3815.18\\Opera.exe");
		capabilities.setCapability(OperaOptions.CAPABILITY, options);

		System.setProperty("webdriver.opera.driver", "C:\\Users\\ercan\\Driver\\OperaDriver\\operadriver.exe");
		driver = new OperaDriver();

	}
	return driver;

}

}
