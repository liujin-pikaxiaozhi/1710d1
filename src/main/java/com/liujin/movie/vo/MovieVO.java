package com.liujin.movie.vo;

import com.liujin.movie.domain.Movie;

public class MovieVO extends Movie{//继承实体对象

	//只需要写父类不存在的属性即可
	private String datea1;
	private String datea2;
	private Double price1;
	private Double price2;
	private Integer longTime1;
	private Integer longTime2;
	private String orderColumn;
	private String orderMether;
	public String getOrderMether() {
		return orderMether;
	}
	public void setOrderMether(String orderMether) {
		this.orderMether = orderMether;
	}
	public String getOrderColumn() {
		return orderColumn;
	}
	public void setOrderColumn(String orderColumn) {
		this.orderColumn = orderColumn;
	}
	public String getDatea1() {
		return datea1;
	}
	public void setDatea1(String datea1) {
		this.datea1 = datea1;
	}
	public String getDatea2() {
		return datea2;
	}
	public void setDatea2(String datea2) {
		this.datea2 = datea2;
	}
	public Double getPrice1() {
		return price1;
	}
	public void setPrice1(Double price1) {
		this.price1 = price1;
	}
	public Double getPrice2() {
		return price2;
	}
	public void setPrice2(Double price2) {
		this.price2 = price2;
	}
	public Integer getLongTime1() {
		return longTime1;
	}
	public void setLongTime1(Integer longTime1) {
		this.longTime1 = longTime1;
	}
	public Integer getLongTime2() {
		return longTime2;
	}
	public void setLongTime2(Integer longTime2) {
		this.longTime2 = longTime2;
	}
	
}
