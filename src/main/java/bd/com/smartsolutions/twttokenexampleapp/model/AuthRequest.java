package bd.com.smartsolutions.twttokenexampleapp.model;

import lombok.AllArgsConstructor; 
import lombok.Data; 
import lombok.NoArgsConstructor; 

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequest { 

	private String username; 
	private String password; 

}

