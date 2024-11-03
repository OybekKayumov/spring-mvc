package com.ok.validation.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Client {

	private String firstName;

	@NotNull
	@Size(min = 2, max = 100, message = "Enter correct last name, min 2 " +
					"symbols, max 100 symbols")
	private String lastName;

	@Min(value = 18, message = "Client must be older than 17")
	@Max(value = 125, message = "Client must be younger than 126")
	private int age;

}
