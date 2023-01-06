package com.curd.function.test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Read {
	public static void get() {
		
		Response responseObj = RestAssured.get("https://httpbin.org/get");
		System.out.println(responseObj.prettyPrint());
		
		
		
	}

}
