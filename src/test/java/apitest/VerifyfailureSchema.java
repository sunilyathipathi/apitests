package apitest;

import org.testng.Assert;
import org.testng.annotations.Test;

import commonUtil.SchemaValidator;

public class VerifyfailureSchema {

	SchemaValidator result = new SchemaValidator();

	@Test(description = "Schema validation- Error scenario")
	public void schemaErrorTest() {
		String filelocation = System.getProperty("user.dir") + "\\src\\test\\resources\\wrongschema.json";

		boolean status = result.jsonSchemaValidation(filelocation);

		Assert.assertFalse(status, "Schema validation for negative test failed");

	}
}