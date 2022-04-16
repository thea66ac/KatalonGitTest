import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import internal.GlobalVariable;


public class HalloSelenium {
	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://selenium.dev");
        driver.close();

        driver.quit();
    }
	
	public String getNumber(int num) {
		
		String returnNum = GlobalVariable.PASSWORD.toString() + 1;
		return returnNum;
	}
}