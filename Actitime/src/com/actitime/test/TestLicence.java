package com.actitime.test;

import org.testng.annotations.Test;

import com.actitime.generic.Baseclass;
import com.actitime.generic.FWUtils;
import com.actitime.pom.ActitimeLoginPage;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.LicensePage;

public class TestLicence extends Baseclass{

	@Test
	public void testLicence()
	{
		String username = FWUtils.getXLData(DATAPATH, "Validinputs", 1, 0);
		String password = FWUtils.getXLData(DATAPATH, "Validinputs", 1, 1);
		ActitimeLoginPage lp=new ActitimeLoginPage(driver);
		lp.getCredentials(username, password);
		lp.ClickLogin();
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.clicksettingbutton();
		e.clicklicenselink();
		LicensePage l=new LicensePage(driver);
		String expected = FWUtils.getXLData(DATAPATH, "Otherdata", 0, 0);
		l.verifyLicencesVersion(expected);
	}
}
