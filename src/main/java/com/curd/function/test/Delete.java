package com.curd.function.test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Delete {

	public static void delete () {
		
		
		
		
		Response responseObj= RestAssured.delete("https://httpbin.org/get");
		System.out.println(responseObj.prettyPrint());
	}
}
