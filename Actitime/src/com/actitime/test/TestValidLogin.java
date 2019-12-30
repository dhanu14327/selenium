package com.actitime.test;

import org.testng.annotations.Test;

import com.actitime.generic.Baseclass;
import com.actitime.generic.FWUtils;
import com.actitime.pom.ActitimeLoginPage;

public class TestValidLogin extends Baseclass{
	
  @Test
  public void verifyValidLogin() throws InterruptedException 
  {
	  ActitimeLoginPage lp=new ActitimeLoginPage(driver);
	  String un = FWUtils.getXLData(DATAPATH, "Validinputs", 1, 0);
	  String pw = FWUtils.getXLData(DATAPATH, "Validinputs", 1, 1);
	  lp.getCredentials(un, pw);
	  lp.ClickLogin();
	  Thread.sleep(5000);
	  String expectedTitle = FWUtils.getXLData(DATAPATH, "Otherdata", 1, 0);
	  FWUtils.verifyTitles(driver, expectedTitle);
  }
}
