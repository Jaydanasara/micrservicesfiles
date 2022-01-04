package com.example.demo.entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
@Entity
public class Company {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;
	private String companyName;
	private Double turnOver;
	private String CEO;
	
	@OneToMany(mappedBy = "company",cascade=CascadeType.ALL)
	private List<Director> directors;
	private String listedInStockExchange;
	private String sector;
	private String briefWriteUp;
	private String stockCode;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Double getTurnOver() {
		return turnOver;
	}
	public void setTurnOver(Double turnOver) {
		this.turnOver = turnOver;
	}
	public String getCEO() {
		return CEO;
	}
	public void setCEO(String cEO) {
		CEO = cEO;
	}
	
	
	public String getListedInStockExchange() {
		return listedInStockExchange;
	}
	public void setListedInStockExchange(String listedInStockExchange) {
		this.listedInStockExchange = listedInStockExchange;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getBriefWriteUp() {
		return briefWriteUp;
	}
	public void setBriefWriteUp(String briefWriteUp) {
		this.briefWriteUp = briefWriteUp;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public List<Director> getDirectors() {
		return directors;
	}
	public void setDirectors(List<Director> directors) {
		this.directors = directors;
	}
	
}
