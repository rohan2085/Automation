package com.paymate.business;

import org.jsmart.zerocode.core.domain.EnvProperty;
import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@TargetEnv("PayMate.properties")
@RunWith(ZeroCodeUnitRunner.class)
@EnvProperty("_${env}")  
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BusinessTest {

	@Test
	@Scenario("PayMate/Business/Business_Boarding.json")
	public void test_Business_Boarding_scenarios() throws Exception {
	}

	@Test
	@Scenario("PayMate/Business/Manage_Business.json")
	public void test_Manage_Business_scenarios() throws Exception {
	}
	
	@Test
	@Scenario("PayMate/Business/Modify_Business.json")
	public void test_Modify_Business_scenarios() throws Exception {
	}

	@Test
	@Scenario("PayMate/Business/Delete_Business.json")
	public void test_Delete_Business_scenarios() throws Exception {
	}

}
