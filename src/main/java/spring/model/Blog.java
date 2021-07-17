package spring.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Blog {
	
	private int id;
	
	private String title;
	
	private Category cat;
	
	private String detail;
	
	private User user;
	
	private String picture;
	
	private int views;
	
	private Timestamp createAt;

}
