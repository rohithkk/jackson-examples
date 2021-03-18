package com.kodakandla.rohith;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializeSensitiveData {

	public static void main(String[] args) throws JsonProcessingException {
		
		ContactInformation cInfo = new ContactInformation("abc@github.com", "123456789", "32216");
		User user = new User("My Name", "123-45-6789", "2020-01-01", cInfo);
		
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new MaskSenstiveDataModule());
		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user));
		
		mapper = new ObjectMapper();
		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user));
	}
}
