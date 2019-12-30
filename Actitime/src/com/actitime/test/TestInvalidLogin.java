package com.actitime.test;

import org.testng.annotations.Test;

import com.actitime.generic.Baseclass;
import com.actitime.generic.FWUtils;

public class TestInvalidLogin extends Baseclass {

	@Test
	public void invalidLogin()
	{
		int rowcount=FWUtils.getLastRowNumber(DATAPATH, "Invalidinputs");
		for (int i = 1; i <=rowcount ; i++) {
			FWUtils.getXLData(DATAPATH, "Invalidinputs", i, 0);
		}
	}
}
