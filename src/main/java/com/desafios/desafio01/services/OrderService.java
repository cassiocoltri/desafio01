package com.desafios.desafio01.services;

import org.springframework.stereotype.Service;

import com.desafios.desafio01.entities.Order;

@Service
public class OrderService extends ShippingService {
	
	public Double total(Order order) {
		return order.getBasic() - (order.getBasic() * order.getDiscont()) / 100;
	}
}
