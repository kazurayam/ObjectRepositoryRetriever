package com.kazurayam.ks

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.kms.katalon.core.testobject.TestObject

public class TestObjectToJsonConverter {
	
	private static GsonBuilder builder = new GsonBuilder();
	
	static {
		builder.setPrettyPrinting();
	}
	
	static String toJson(TestObject to, Boolean prettyPrint) {}
	
	static String toJson(TestObject to) {
		Gson gson = builder.create()
		return gson.toJson(to)
	}
}
