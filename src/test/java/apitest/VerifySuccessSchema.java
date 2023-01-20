package apitest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Util.SchemaValidator;

public class VerifySuccessSchema {

	SchemaValidator result = new SchemaValidator();

	@Test
	public void verifySuccessSchemaTest() {
		String filelocation = "E:\\testsmallcase\\src\\test\\resources\\schema.json";
		boolean status = result.jsonSchemaValidation(filelocation);
		Assert.assertTrue(status, " Schema validation done, test passed");
		

	}
}
