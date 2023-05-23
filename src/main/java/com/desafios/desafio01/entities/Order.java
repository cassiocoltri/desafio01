package com.desafios.desafio01.entities;

public class Order {
	
	private Integer cod;
	private Double basic;
	private Double discont;
	
	public Order() {
	}

	public Order(Integer cod, Double basic, Double discont) {
		super();
		this.cod = cod;
		this.basic = basic;
		this.discont = discont;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Double getBasic() {
		return basic;
	}

	public void setBasic(Double basic) {
		this.basic = basic;
	}

	public Double getDiscont() {
		return discont;
	}

	public void setDiscont(Double discont) {
		this.discont = discont;
	}

}
