package com.desafios.desafio01.services;

import org.springframework.stereotype.Service;

import com.desafios.desafio01.entities.Order;

@Service
public class ShippingService {
	
	public Double shipment(Order order) {
		
		if (order.getBasic() < 100.0) {
			return 20.0;
		}
		if (order.getBasic() > 200.0) {
			return 0.0;
		}
		else {
			return 12.0;
		}
	}

}
