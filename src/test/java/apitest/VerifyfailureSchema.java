package apitest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Util.SchemaValidator;

public class VerifyfailureSchema {

	SchemaValidator result = new SchemaValidator();

	@Test
	public void schemaErrorTest() {
		String filelocation = "E:\\testsmallcase\\src\\test\\resources\\wrongschema.json";

		boolean status = result.jsonSchemaValidation(filelocation);
		Assert.assertFalse(status, " Schema validation for negative test done, test passed");
	}
}