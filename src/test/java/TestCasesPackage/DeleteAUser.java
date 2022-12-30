package TestCasesPackage;

import org.junit.Test;
import org.junit.runner.RunWith;

import TestSteps.StepsClass;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class DeleteAUser {
	
	@Steps
	StepsClass stepCls;
	
	String userId="4";
	
	@Test
	public void deleteAUserTestClass() {
		stepCls.deleteRequestStepsClass(userId);
		
	}
	
	

}
