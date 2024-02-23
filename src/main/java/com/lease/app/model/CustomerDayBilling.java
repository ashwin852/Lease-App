package com.lease.app.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer day billing")
public class CustomerDayBilling {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long phoneNo;
	
	private String site;
	
	private LocalDateTime date;
	
	private String materialName;
	
	private Integer itemsCount;
	
	private Double amount;
	
	

	public CustomerDayBilling(Long phoneNo, String site, LocalDateTime date, String materialName, Integer itemsCount,
			Double amount) {
		this.phoneNo = phoneNo;
		this.site = site;
		this.date = date;
		this.materialName = materialName;
		this.itemsCount = itemsCount;
		this.amount = amount;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public Integer getItemsCount() {
		return itemsCount;
	}

	public void setItemsCount(Integer itemsCount) {
		this.itemsCount = itemsCount;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
	
}
