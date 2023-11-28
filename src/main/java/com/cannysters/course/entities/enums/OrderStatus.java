package com.cannysters.course.entities.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELEVERED(4),
	CANCELED(5);
	
	//Para controlar manualmente a numeração de cada item e preciso criar toda essa estrutura abaixo
	private int code;
	
	//Contrutor de Enumerações e private diferente de construtor de classes
	private OrderStatus (int code) {
		this.code = code;
	}
	
	//Retornar o código quando necessário
	public int getCode() { 
		return code;
	}
	
	// Retorna o OrderStatus conforme o código informado no chamado
	public static OrderStatus valueOf(int code){ 
		for(OrderStatus value: OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatuts Code");
	}
	
}
