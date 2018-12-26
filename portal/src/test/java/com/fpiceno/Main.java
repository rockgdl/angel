package com.fpiceno;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Main {
	
	public static void main (String[] arg){
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(encoder.encode("fpiceno"));
	}

}
