package main.java.emlakburada.dto.response;

import emlakburada.model.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {

	private String name;
	private String email;
	private String photo;
	private String biography;
	private String password;

}
