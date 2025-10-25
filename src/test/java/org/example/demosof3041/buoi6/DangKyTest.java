package org.example.demosof3041.buoi6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DangKyTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void TestDangNhap() throws InterruptedException{
        driver.get("https://vitimex.com.vn/account/login");
        Thread.sleep(2000);
        driver.findElement(By.id("customer_email")).sendKeys("minhtu1760970283661@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("customer_password")).sendKeys("Ndmtu1509.");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".btn-vtm.btn-signin")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("https://vitimex.com.vn/account"));
        System.out.println("Dang nhap thanh cong");
    }
    @Test
    public void TestDangKy() throws InterruptedException {
        driver.get("https://vitimex.com.vn/account/register");
        Thread.sleep(2000);
        driver.findElement(By.id("last_name")).sendKeys("Nguyen");
        Thread.sleep(1000);
        driver.findElement(By.id("first_name")).sendKeys("Minh Tu");
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("minhtu" + System.currentTimeMillis() + "@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("Ndmtu1509.");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
        Thread.sleep(2000);

        Assert.assertTrue(driver.getPageSource().contains("Tài khoản của tôi"),
                "❌ Không tìm thấy thông báo hoặc phần tử sau khi đăng ký!");
        System.out.println("Dang ky thanh cong");
    }

    @AfterClass
    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
    }
}
