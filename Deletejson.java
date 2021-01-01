package com.KeyValueStore.Json;

import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Deletejson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassLoader classloader = new ReadJson().getClass().getClassLoader();
		String file = "C:\\Users\\pc\\Documents\\Eclipse\\KeyValueStore\\Students.json";
		File files = new File(file);
		JSONParser parser = new JSONParser();
		try {
			FileReader reader = new FileReader(files.getAbsoluteFile());
			Object obj = parser.parse(reader);
			JSONObject jsonobj = (JSONObject)obj;
			JSONObject Details = (JSONObject)jsonobj.get("Student 1");
			
			Details.remove("Skills");
			System.out.println("Details : " +Details.toJSONString());
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
