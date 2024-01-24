package com.Jenkins.implementation;

import org.testng.annotations.Test;

import baseTest.BaseTest;

public class gmail extends BaseTest {
	@Test
	public void launch() {
		try {
			launchBrowser("chrome");
		} finally {
			closeBrowser();
		}
	}
}
