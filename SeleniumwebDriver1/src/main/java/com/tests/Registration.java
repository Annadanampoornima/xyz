package com.tests;

import org.testng.annotations.Test;

public class Registration {
@Test
public void TestRegistration() {
	System.setProperty("webdriver.ie.driver","\\C:\\Users\\annadanam.poornima\\Downloads\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
Object DiverUtility;
WebDriver driver=DiverUtility.getDriver("ie");
driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
driver.manage().window().maximize();
driver.findElement(By)
}


}
