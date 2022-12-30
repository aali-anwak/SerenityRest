package TestCasesPackage;

import static org.hamcrest.Matcher.*;

import org.hamcrest.Matchers;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import TestSteps.StepsClass;
import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class GetTheUsers {
	
	@Steps
	StepsClass stepCls;
	
	@Test
	public void getAllTheUsersTestClass()
	{
		stepCls.getAllTheUsersStepsClass();
			
	}
	
	
	
	

	

}
