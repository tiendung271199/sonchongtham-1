package spring.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
	
	private int id;
	
	@NotBlank(message = "Tên danh mục không được để trống!")
	@Size(min = 2, message = "Tên danh mục phải nhiều hơn 2 ký tự!")
	private String name;

}
