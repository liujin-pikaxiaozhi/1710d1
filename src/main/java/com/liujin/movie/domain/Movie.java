package com.liujin.movie.domain;

public class Movie {

	private Integer id;
	private String name;
	private Double price;
	private String datea;
	private Integer longTime;
	private Integer year;
	private String area;
	private Integer status;
	public Movie(Integer id, String name, Double price, String datea, Integer longTime, Integer year, String area,
			Integer status) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.datea = datea;
		this.longTime = longTime;
		this.year = year;
		this.area = area;
		this.status = status;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", price=" + price + ", datea=" + datea + ", longTime=" + longTime
				+ ", year=" + year + ", area=" + area + ", status=" + status + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDatea() {
		return datea;
	}
	public void setDatea(String datea) {
		this.datea = datea;
	}
	public Integer getLongTime() {
		return longTime;
	}
	public void setLongTime(Integer longTime) {
		this.longTime = longTime;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
}
