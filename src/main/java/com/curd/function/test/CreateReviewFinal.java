package com.curd.function.test;

import org.testng.asserts.SoftAssert;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateReviewFinal {
	static Response response;
	
	public  static void post() {
		
		
		JsonObject jo =new JsonObject();
		jo.addProperty("Batch", "29");
		
		RequestSpecification rs = RestAssured.given();
		rs.body(jo.toString());
		rs.header("Content-Type","application");
		
		Response response= RestAssured.post("https://httpbin.org/post");
		//System.out.println(response.asString());
		
		
		
	}
	
public static void postTestcases() {
	SoftAssert sa =new SoftAssert();
	
	
	
	//status code check
	sa.assertTrue(response.statusCode()==200,"Expected=200"+"Actual="+response.statusCode());
	//response time
	sa.assertTrue(response.time()<1000,"Expected=<1000"+"Actual="+response.time());
	//content type =json
	sa.assertTrue(response.contentType().contains("json"),"Expected=json"+"Actual");
	//Body>>data null or not
	sa.assertTrue(! response.body().asString().equals(null));
	
	sa.assertAll();
}
}
