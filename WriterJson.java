package com.KeyValueStore.Json;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriterJson {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		JSONObject stu1 = new JSONObject();
		stu1.put("Firstname","Vijay");
		stu1.put("Lastname","Balaji");
		stu1.put("Age","21");
		stu1.put("City","Chennai");
		stu1.put("Degree","B.Tech");
		
		JSONArray Stu1skills = new JSONArray();
		Stu1skills.add("Java");
		Stu1skills.add("JavaScript");
		Stu1skills.add("Python");
		
		stu1.put("Skills",Stu1skills);
		
		JSONObject Student1 = new JSONObject();
		Student1.put("Student 1",stu1);
		
		
		JSONObject stu2 = new JSONObject();
		stu2.put("Firstname","Rahul");
		stu2.put("Lastname","Kumar");
		stu2.put("Age","22");
		stu2.put("City","Bangalore");
		stu2.put("Degree","B.E");
		
		JSONArray Stu2skills = new JSONArray();
		Stu2skills.add("Java");
		Stu2skills.add("JavaScript");
		Stu2skills.add("Python");
		Stu2skills.add("Ruby");
		
		stu2.put("Skills",Stu1skills);
		
		JSONObject Student2 = new JSONObject();
		Student2.put("Student 2",stu1);
		
		try(FileWriter writer = new FileWriter("Students.json")){
			writer.write(Student1.toJSONString());
			writer.write(Student2.toJSONString());
			writer.flush();
			writer.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

