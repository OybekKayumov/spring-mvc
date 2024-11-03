package com.ok.validation.anotations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CarNumberValidator.class)
public @interface CarNumber {

	public String value() default "UZB";

	public String message() default "Car number must ends UZB";

	public Class<?>[] groups() default {};

	public Class<? extends Payload>[] payload() default {};
}
