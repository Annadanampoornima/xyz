package com.tests;

import org.testng.annotations.Test;

public class Actions {
	@Test
	public void testTestmeapp() {
		WebDriver driver=DiverUtility.getDriver("ie");
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		Actions act1=new Actions(driver);
		act1.

}
