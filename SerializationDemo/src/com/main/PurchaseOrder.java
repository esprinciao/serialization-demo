package com.main;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PurchaseOrder implements Serializable{

	private String orderId;
	private String Company;
	transient private int qty;
	transient private double price;
	
	
	public PurchaseOrder() {

	}
	
	public PurchaseOrder(String orderId, String company, int qty, double price) {
		super();
		this.orderId = orderId;
		Company = company;
		this.qty = qty;
		this.price = price;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "PurchaseOrder [orderId=" + orderId + ", Company=" + Company + ", qty=" + qty + ", price=" + price + "]";
	}
	
	
	
}

