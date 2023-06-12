package com.example.imple.user.model;

import org.hibernate.validator.constraints.Length;

import com.example.standard.model.Modelable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor(staticName="of")
@NoArgsConstructor
@Builder
public class UserDTO implements Modelable<User> {
	
	@NonNull
	@Length(max=10)
	String username;
	
	@NonNull
	@Length(max=9)
	String password;

	@NonNull
	@Length(max=10)
	String name;
	
	@Override
	public User getModel() {
		return User.builder()
				   .username(username)
				   .password(password)
				   .name(name)
				   .build();
	}
}
