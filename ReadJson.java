package com.KeyValueStore.Json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJson {

	public static void read() {
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
			System.out.println("Details : " +Details.toJSONString());
			
			String studentName = (String)Details.get("Firstname");
			System.out.println("Student name "+studentName);
			
			JSONArray skills = (JSONArray)Details.get("Skills");
			System.out.println("Skills "+skills);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
