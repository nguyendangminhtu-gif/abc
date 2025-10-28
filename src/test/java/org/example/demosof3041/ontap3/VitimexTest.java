package org.example.demosof3041.ontap3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class VitimexTest {
    WebDriver webDriver;

    @BeforeClass
    public void setup() {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @Test
    public void timKiemVaThemGioHang() throws InterruptedException {
        // Vào trang
        webDriver.get("https://vitimex.com.vn/");
        Thread.sleep(2000);

        // Tìm kiếm sản phẩm
        webDriver.findElement(By.cssSelector("inputSearchAuto")).sendKeys("Áo thun polo");
        webDriver.findElement(By.id("submit")).click();
        Thread.sleep(3000);

        // Chọn sản phẩm đầu tiên
        webDriver.findElement(By.cssSelector(".product-item a")).click();
        Thread.sleep(3000);

        // Thêm vào giỏ
        webDriver.findElement(By.id("btn-add-cart")).click();
        Thread.sleep(3000);

        // Assert để xác nhận sản phẩm đã vào giỏ
        Assert.assertTrue(webDriver.getPageSource().contains("Giỏ hàng"),
                "❌ Không thấy thông báo giỏ hàng → Fail bài!");

        System.out.println("✅ Đã thêm sản phẩm vào giỏ thành công!");
    }

//    @AfterClass
//    public void teardown() {
//        if (webDriver != null) {
//            webDriver.quit();
//        }
//    }
}
