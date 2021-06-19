package com.jessicafeitosa.springbootjwt.data;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UserData implements Serializable {
	
	private String userName;
	private String password;
	
	

}
