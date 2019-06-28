package com.hcl.bank;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcl.bank.model.Address;
import com.hcl.bank.model.Person;

public class TestJson {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

		Address address = new Address("Dhananjaypur", "Varanasi", "UP");
		Person person = new Person(1, "Arvind", address);
		ObjectMapper mapper = new ObjectMapper();
        
		//check file is available or not 
		File file = new File("src/main/resources/static/dataOne.json");
		if(file.exists())
		{
			System.out.println("file exists");
		}
		else
		{
			System.out.println("file does not exists");
		}
		
		
		  mapper.writeValue(file, person);
		  System.out.println("file writing has done");
		 

	}

}
