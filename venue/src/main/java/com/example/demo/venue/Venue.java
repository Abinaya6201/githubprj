package com.example.demo.venue;

import com.example.demo.venue.Type;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Table;

@Entity
//@Table(name="Ventordetails")
public class Venue {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  Integer id;
	private String address;
	private Integer capacity;
	private Double price;
	@Enumerated(EnumType.STRING)
	private Type type;
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Venue(Integer id, String address, Integer capacity, Double price) {
		super();
		this.id = id;
		this.address = address;
		this.capacity = capacity;
		this.price = price;
	}
	public Venue() {
		super();
	}
	
	@Override
	public String toString() {
		return "Ventor [id=" + id + ", address=" + address + ", capacity=" + capacity + ", price=" + price + ", type="
				+ type + "]";
	}
	

}
