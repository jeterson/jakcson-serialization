package com.jackson.serialization;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	
	public static void main(String[] args) {
		String json = "{\r\n" + 
				"\"dados\": [\r\n" + 
				"{\r\n" + 
				"\"data\": \"02/03/2017 15:29\",\r\n" + 
				"\"msg\": \"teste1\"\r\n" + 
				"},\r\n" + 
				"{\r\n" + 
				"\"data\": \"02/03/2017 11:39\",\r\n" + 
				"\"msg\": \"teste2\"\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"]\r\n" + 
				"\r\n" + 
				"}";
		
		ObjectMapper om = new ObjectMapper();
		try {
			Response res =  om.readValue(json, Response.class);
			
			for(Item i : res.getDados()) {
				System.out.println(i.getData().toString());
				System.out.println(i.getMsg());
			}
			
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
