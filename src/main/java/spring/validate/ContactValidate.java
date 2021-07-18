package spring.validate;

import java.util.Locale;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import spring.constant.GlobalConstant;
import spring.model.Contact;

@Component
public class ContactValidate implements Validator {

	@Autowired
	private MessageSource messageSource;

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}

	@Override
	public void validate(Object object, Errors errors) {

	}

	public void validatePhone(Contact contact, Errors errors) {
		if (!contact.getPhone().equals(GlobalConstant.EMPTY)) {
			if (!Pattern.matches("(0[3|5|7|8|9])+([0-9]{8})", contact.getPhone())) {
				errors.rejectValue("phone", null,
						messageSource.getMessage("formatPhoneError", null, Locale.getDefault()));
			}
		}
	}

}
