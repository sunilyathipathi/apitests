package apitest;

import org.testng.Assert;
import org.testng.annotations.Test;

import commonUtil.SchemaValidator;

public class VerifySuccessSchema {

	SchemaValidator result = new SchemaValidator();

	@Test(description = "Schema validation- Passing scenario")
	public void verifySuccessSchemaTest() {

		String filelocation = System.getProperty("user.dir") + "\\src\\test\\resources\\schema.json";
		boolean status = result.jsonSchemaValidation(filelocation);
		Assert.assertTrue(status, "Schema validation success testcase failed");

	}
}
