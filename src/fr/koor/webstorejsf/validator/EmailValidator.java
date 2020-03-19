package fr.koor.webstorejsf.validator;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<Email, String> {

	private static Pattern emailPattern = Pattern.compile( "^[\\w.-]+@[\\w.-]+\\.[a-z]{2,}$" );
	
	@Override
	public boolean isValid(String s, ConstraintValidatorContext cvc) {
		return emailPattern.matcher(s).find();
	}

}
