package apitest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Util.SchemaValidator;

public class VerifySuccessSchema {

	SchemaValidator result = new SchemaValidator();

	@Test(description = "Schema validation- Passing scenario")
	public void verifySuccessSchemaTest() {

		String filelocation = System.getProperty("user.dir") + "\\src\\test\\resources\\schema.json";
		boolean status = result.jsonSchemaValidation(filelocation);
		Assert.assertTrue(status, " Schema validation done, test passed");

	}
}
