package Util;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import java.io.File;

public class SchemaValidator {
	public boolean jsonSchemaValidation(String filelocation) {
		boolean status = false;
		try {

			RestAssured.baseURI = "https://bookstore.toolsqa.com/BookStore/v1/Books";

			// obtain response
			given().when().get()

					// verify JSON Schema
					.then().statusCode(200).and().assertThat()
					.body(JsonSchemaValidator.matchesJsonSchema(new File(filelocation)));

			System.out.println("Schema validation was successful");

			status = true;
		}

		catch (AssertionError e) {
			System.out.println("Exception caught and  schema validation failed");
			System.out.println(e.getMessage());
			status = false;
		}

		return status;

	}

}