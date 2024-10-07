package com.br.barberapp.dao;

import com.br.barberapp.dao.enums.Position;
import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class User {
	
	String ID, name, surName, localizer, password, phone, email;
	Position position;
	Gson historyServices;
	double balance;

}
