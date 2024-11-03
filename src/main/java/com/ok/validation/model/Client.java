package com.ok.validation.model;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class Client {

	private String firstName;

	@NotNull
	@Size(min = 2, max = 100, message = "Enter correct last name, min 2 " +
					"symbols, max 100 symbols")
	private String lastName;

	@NotNull(message = "Enter your age")
	@Min(value = 18, message = "Client must be older than 17")
	@Max(value = 125, message = "Client must be younger than 126")
	private Integer age;

	@NotNull          // 12a3A
	@Pattern(regexp = "^[A-Za-z0-9]{5}", message = "Enter valid zip code. " +
					"Only numbers, 5 digits")
	private String zipCode;



}
