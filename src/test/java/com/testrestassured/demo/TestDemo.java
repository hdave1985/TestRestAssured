package com.testrestassured.demo;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.http.Headers;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.internal.common.assertion.AssertionSupport;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.path.json.JsonPath;
import io.restassured.path.json.config.JsonPathConfig;
import io.restassured.path.xml.XmlPath;
import io.restassured.path.xml.XmlPath.CompatibilityMode;
import io.restassured.path.xml.config.XmlPathConfig;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;


import static io.restassured.RestAssured.given;

public class TestDemo 
{
	
	@Test
	public  void getDetails() {
		
		RestAssured rest = new RestAssured();
//		rest.baseURI = "https://demoqa.com/utilities/weather/city";
		rest.baseURI = "https://jsonplaceholder.typicode.com";
		
		Response response = given()
				.contentType(ContentType.JSON)
				.param("postId", "2")
				.when()
				.get("/comments")
				.then()
				.extract().response();
		
		Assertion
	
	}
	
	
	
}

