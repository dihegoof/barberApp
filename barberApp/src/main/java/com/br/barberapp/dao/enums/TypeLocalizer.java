package com.br.barberapp.dao.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TypeLocalizer { 
	
	RG(8),
	CPF(10);
	
	int sintax;
	
}