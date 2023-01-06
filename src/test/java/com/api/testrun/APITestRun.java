package com.api.testrun;

import com.curd.function.test.Create;
import com.curd.function.test.Delete;
import com.curd.function.test.Read;
import com.curd.function.test.Update;

public class APITestRun {

	public static void main(String[] args) {
		
		
		Read.get();
		Delete.delete();
		Create.post();
		Update.put();
	}
	
	
}
