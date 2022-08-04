package com.kazurayam.ks

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.kms.katalon.core.testobject.TestObject

public class TestObjectToJsonConverter {

	static String toJson(TestObject to, Boolean prettyPrint = false) {
		GsonBuilder builder = new GsonBuilder()
		if (prettyPrint) {
			builder.setPrettyPrinting()
		}
		Gson gson = builder.create()
		return gson.toJson(to)
	}
}
