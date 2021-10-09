package String;

public class Validation {

	public String userName(String name) {

		if (name.length()<4 || name.isEmpty() || name.isBlank()) {
			return " enter valid name or not less than 4 characters & Name sholud not be empty";
		}
		return "Registration is successful";

	}

	public String userCity(String city) {
		if (city.length() < 4 || city.isEmpty() || city.isBlank()) {
			return " City should not be empty or blank! Please eter valid city name";
		}
		return "Registration successful";
	}

	public String userPincode(String pincode) {
		if (pincode.length()==6 && pincode.isEmpty()) {
			return "Enter valid pincode";
		}
		return "Registration success";
	}

	public String userPhone(String phoneno) {
		if (phoneno.startsWith("6") || phoneno.startsWith("7") || phoneno.startsWith("8") || phoneno.startsWith("9") && phoneno.length() == 10 && phoneno.isEmpty()) {
			return "Registration of phone number is success";
		}  
		
		return "Your phone number is invalid";
	}

	public String userEmail(String email) {
		if (email.length() <=15 && email.endsWith(".com") && email.isEmpty()) {
			return "Registration success";
		}
		return "Email should not be empty! plz enter valid email id ";
	}
}
