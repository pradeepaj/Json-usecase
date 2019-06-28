package com.hcl.bank;

import java.io.File;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcl.bank.model.Address;
import com.hcl.bank.model.Person;

@SpringBootApplication
public class JsonApplication {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		SpringApplication.run(JsonApplication.class, args);

		Address address = new Address("Dhananjaypur", "Varanasi", "UP");
		Person person = new Person(1, "Arvind", address);
		ObjectMapper mapper = new ObjectMapper();

		mapper.writeValue(
				new File("C:/Users/ninja/Documents/workspace/pradeep/Json/src/main/resources/static/dataOne.json"),
				person);
	}

}
