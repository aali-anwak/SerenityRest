package TestCasesPackage;

import org.junit.Test;
import org.junit.runner.RunWith;

import TestSteps.StepsClass;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.UseTestDataFrom;

@Concurrent
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(".\\src\\test\\resources\\data\\users.csv")
public class PostARequest {
	
	private String email;
	private String first_name;
	private String last_name;
	
	

		
		public void setEmail(String email) {
		this.email = email;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

		@Steps
		StepsClass stepCls;
		
		int code=201;
		
		@Test
		public void postRequestTest()
		{
			
			stepCls.postARequestStepsClass(email,first_name,last_name);

			
		}
		
		

	}



