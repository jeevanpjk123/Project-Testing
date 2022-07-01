package ProjectInsta;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class DDT {
	 WebDriver driver;
	    Workbook wb;
	    Sheet sh;
	    int numrow;
	    String uname;
	    String pwd;
	    @BeforeTest
	    public void setup() throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver",
	                 "C:\\\\Users\\\\ponnamjeevan.kumar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	          driver=new ChromeDriver();
	          driver.get("https://www.instagram.com/");
	          Thread.sleep(500);
	          driver.manage().window().maximize();
	      }
	   
	      @Test(dataProvider = "testdata")
	      public void verifiy(String uname, String pwd) throws InterruptedException {
	          driver.findElement(By.name("username")).sendKeys(uname);
	          driver.findElement(By.name("password")).sendKeys(pwd);
	          driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
	        Thread.sleep(5000);
	          driver.navigate().refresh();
	    }

	   @DataProvider(name = "testdata")
	    public Object [][] TestDataFeed(){

	        try {
	            wb = Workbook.getWorkbook(new File ("C:\\Users\\ponnamjeevan.kumar\\OneDrive - HCL Technologies Ltd\\Desktop\\Book1.xls"));
	            sh = wb.getSheet(0);
	            numrow = sh.getRows();
	        }
	        catch(Exception e)
	        { 
	            e.printStackTrace();

	        }

	        Object[][] instadata = new Object [numrow][sh.getColumns()];
	        for(int i=0;i<numrow;i++) {
	            instadata[i][0]= sh.getCell(0,i).getContents();
	            instadata[i][1]= sh.getCell(1,i).getContents();




	}
	    return instadata;
	   }
}
