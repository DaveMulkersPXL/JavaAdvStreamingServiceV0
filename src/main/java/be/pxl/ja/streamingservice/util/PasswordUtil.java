package be.pxl.ja.streamingservice.util;

public class PasswordUtil {

	private static final String SPECIAL_CHARACTERS = "~!@#$%^&*()_-";

	public static int calculateStrength(String password) {
		int strength = 0;
		int hasNumber = 0;
		int hasLowerCase = 0;
		int hasUpperCase = 0;
		int hasSpecial = 0;
		if (password.length() < 6)
			return strength;
		else if (password.length() < 10){
			strength = 1;
		}
		else {
			strength = 2;
		}
		for (int i = 0; i < password.length(); i++){
			if (Character.isDigit(password.charAt(i)))
				hasNumber = 2;
			else if (Character.isUpperCase(password.charAt(i)))
				hasUpperCase = 2;
			else if (Character.isLowerCase(password.charAt(i)))
				hasLowerCase = 2;
			else if (SPECIAL_CHARACTERS.contains(String.valueOf(password.charAt(i))))
				hasSpecial = 2;
		}
		return strength + hasLowerCase + hasNumber + hasSpecial + hasUpperCase;
	}
}
