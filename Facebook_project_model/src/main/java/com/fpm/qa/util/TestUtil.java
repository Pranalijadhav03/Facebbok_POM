package com.fpm.qa.util;

import com.fpm.qa.base.TestBase;

public class TestUtil extends TestBase {
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;

	public void switchToFrame() {
		driver.switchTo().frame("Friends");
	}

}


