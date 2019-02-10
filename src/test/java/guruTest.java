package newproject;

    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    public class guruTest {

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\natal\\IdeaProjects\\test\\src\\test\\java\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            String baseUrl = "http://fitatu.com";
            String expectedTitle = "Fitatu - Strać wagę. Nie siebie. Najbardziej ludzki sposób odchudzania.";
            String actualTitle = "";

            driver.get(baseUrl);
            actualTitle = driver.getTitle();
            if (actualTitle.contentEquals(expectedTitle)){
                System.out.println("Test passed!");
            }else {
                System.out.println("Test failed");
            }
            driver.close();

    }
}
