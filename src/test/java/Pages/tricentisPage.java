package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class tricentisPage {

    protected WebDriver driver;

    //Formulario Enter Vehicle Data
    private By cb_make = By.id("make");
    private By cb_model = By.id("model");
    private By txt_cylinder = By.id("cylindercapacity");
    private By txt_engine_performance = By.id("engineperformance");
    private By txt_date_of_Manufacture = By.id("dateofmanufacture");
    private By cb_number_of_seats = By.id("numberofseats");
    private By rd_right_hand_drive = By.className("ideal-radiocheck-label");
    private By cb_number_of_seats2 = By.id("numberofseatsmotorcycle");
    private By cb_fuel_type = By.id("fuel");
    private By cb_payload = By.id("payload");
    private By txt_total_weight = By.id("totalweight");
    private By txt_list_price = By.id("listprice");
    private By txt_license_plate_number = By.id("licenseplatenumber");
    private By txt_annual_mileage = By.id("annualmileage");
    private By btn_next = By.id("nextenterinsurantdata");

    //Formulario EnterInsurantDataData
    private By txt_fist_name = By.id("firstname");
    private By txt_last_name = By.id("lastname");
    private By txt_date_of_birth = By.id("birthdate");
    private By rd_gender = By.className("ideal-radiocheck-label");
    private By txt_street_address = By.id("streetaddress");
    private By cb_contry = By.id("country");
    private By txt_zipcode = By.id("zipcode");
    private By txt_city = By.id("city");
    private By cb_country = By.id("country");
    private By cb_public_official = By.id("occupation");
    private By txt_website = By.id("website");
    private By btn_next2 = By.id("nextenterproductdata");

    //Formulario Enter Product Data

    private By txt_start_date = By.id("startdate");
    private By cb_insurancesum = By.id("insurancesum");
    private By cb_meritrating = By.id("meritrating");
    private By cb_damageinsurance = By.id("damageinsurance");
    private By ckb_euroProtection = By.id("EuroProtection");
    private By cb_courtesycar = By.id("courtesycar");
    private By btn_next3 = By.id("nextselectpriceoption");

    //Formulario Select Price Option
    private By btn_selectsilver = By.id("selectsilver");
    private By btn_nextsendquote = By.id("nextsendquote");



    public void accessHomePage(String url) {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to(url);
    }

    public void devePreecherFormularioEnterVehicleData() {

        WebElement element_1 = driver.findElement(cb_make);
        Select combo_1 = new Select(element_1);
        combo_1.selectByVisibleText("Volvo");

        WebElement element_2 = driver.findElement(cb_model);
        Select combo_2 = new Select(element_2);
        combo_2.selectByVisibleText("Scooter");

        driver.findElement(txt_cylinder).sendKeys("500");
        driver.findElement(txt_engine_performance).sendKeys("200");
        driver.findElement(txt_date_of_Manufacture).sendKeys("04/22/1986");

        WebElement element_3 = driver.findElement(cb_number_of_seats);
        Select combo_3 = new Select(element_3);
        combo_3.selectByVisibleText("5");

        driver.findElement(rd_right_hand_drive).click();

        WebElement element_4 = driver.findElement(cb_number_of_seats2);
        Select combo_4 = new Select(element_4);
        combo_4.selectByVisibleText("2");

        WebElement element_5 = driver.findElement(cb_fuel_type);
        Select combo_5 = new Select(element_5);
        combo_5.selectByVisibleText("Petrol");

        driver.findElement(cb_payload).sendKeys("150");
        driver.findElement(txt_total_weight).sendKeys("500");
        driver.findElement(txt_list_price).sendKeys("1600");
        driver.findElement(txt_license_plate_number).sendKeys("1569r");
        driver.findElement(txt_annual_mileage).sendKeys("1569");
        driver.findElement(btn_next).click();

    }

    public void devePreencherFormularioEnterInsurantData() {

        driver.findElement(txt_fist_name).sendKeys("Leonardo");
        driver.findElement(txt_last_name).sendKeys("Pereira");
        driver.findElement(txt_date_of_birth).sendKeys("04/22/1986");
        driver.findElement(rd_gender).click();
        driver.findElement(txt_street_address).sendKeys("Jardin Oceanico");

        WebElement element6 = driver.findElement(cb_contry);
        Select combo6 = new Select(element6);
        combo6.selectByVisibleText("Brazil");

        driver.findElement(txt_zipcode).sendKeys("22753703");
        driver.findElement(txt_city).sendKeys("Rio de Janeiro");

        WebElement element7 = driver.findElement(cb_country);
        Select combo7 = new Select(element7);
        combo7.selectByVisibleText("Brazil");

        WebElement element8 = driver.findElement(cb_public_official);
        Select combo8 = new Select(element8);
        combo8.selectByVisibleText("Public Official");

        driver.findElement(txt_website).sendKeys("https://www.accenture.com/br-pt");
        driver.findElement(btn_next2).click();

    }

    public void devePreencherFormularioEnterProductData() {

        driver.findElement(txt_start_date).sendKeys("04/22/2026");

        WebElement element9 = driver.findElement(cb_insurancesum);
        Select combo9 = new Select(element9);
        combo9.selectByValue("7000000");

        WebElement element10 = driver.findElement(cb_meritrating);
        Select combo10 = new Select(element10);
        combo10.selectByValue("Bonus 5");

        WebElement element11 = driver.findElement(cb_damageinsurance);
        Select combo11 = new Select(element11);
        combo11.selectByValue("Partial Coverage");

        driver.findElement(ckb_euroProtection).click();

        WebElement element12 = driver.findElement(cb_courtesycar);
        Select combo12 = new Select(element12);
        combo12.selectByValue("Yes");

        driver.findElement(btn_next3).click();
    }

   public void devePreencherFormulárioSelectPriceOption(){

       driver.findElement(btn_selectsilver).click();
       driver.findElement(btn_nextsendquote).click();

   }


}