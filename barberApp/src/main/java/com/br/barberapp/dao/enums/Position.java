package com.br.barberapp.dao.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Position {

	ADMIN,
	BARBEIRO,
	CLIENTE;
	
	public String getFormatName() { 
		switch(this) {
		case ADMIN:
			return "Administrador";
		case BARBEIRO:
			return "Barbeiro";
		default:
			return "Cliente";
		}
	}
}
