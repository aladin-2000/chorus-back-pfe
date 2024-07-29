package com.chorus.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Wallet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long aidprt;
	private String acdprt;
	private String allprt;
	
	public Long getAidprt() {
		return aidprt;
	}
	public void setAidprt(Long aidprt) {
		this.aidprt = aidprt;
	}
	public String getAcdprt() {
		return acdprt;
	}
	public void setAcdprt(String acdprt) {
		this.acdprt = acdprt;
	}
	public String getAllprt() {
		return allprt;
	}
	public void setAllprt(String allprt) {
		this.allprt = allprt;
	}
	  
	  
	 
}
